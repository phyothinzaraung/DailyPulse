package com.phyo.dailypulse.application

import com.phyo.dailypulse.data.ArticleRaw
import com.phyo.dailypulse.data.ArticlesService
import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.daysUntil
import kotlinx.datetime.toLocalDateTime
import kotlinx.datetime.todayIn
import kotlin.math.abs

class ArticlesUseCase(private val service: ArticlesService) {
    suspend fun getArticles(): List<Article>{
        val articlesRaw = service.fetchArticles()
        return mapArticles(articlesRaw)
    }

    private fun mapArticles(articlesRaw: List<ArticleRaw>): List<Article> = articlesRaw.map {
        Article(
            it.title,
            it.desc ?: "Click to find out more",
            getDaysAgoString(it.date),
            it.imageUrl ?: "https://images.unsplash.com/photo-1607252650355-f7fd0460ccdb?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YW5kcm9pZHxlbnwwfHwwfHx8MA%3D%3D"
        )
    }

    private fun getDaysAgoString(date: String): String{
        val today = Clock.System.todayIn(TimeZone.currentSystemDefault())
        val days = today.daysUntil(
            Instant.parse(date).toLocalDateTime(TimeZone.currentSystemDefault()).date
        )

        val result = when {
            abs(days) > 1 -> "${abs(days)} days ago"
            abs(days) == 1 -> "Yesterday"
            else -> "Today"
        }
        return result
    }
}