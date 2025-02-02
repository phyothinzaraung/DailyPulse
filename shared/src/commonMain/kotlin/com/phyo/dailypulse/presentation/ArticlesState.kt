package com.phyo.dailypulse.presentation

import com.phyo.dailypulse.application.Article

data class ArticlesState(
    val articles: List<Article> = listOf(),
    val loading: Boolean = false,
    val error: String? = null
)
