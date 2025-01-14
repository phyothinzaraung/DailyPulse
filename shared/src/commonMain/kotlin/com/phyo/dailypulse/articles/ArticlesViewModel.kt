package com.phyo.dailypulse.articles

import com.phyo.dailypulse.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class ArticlesViewModel: BaseViewModel() {
    private val _articlesState: MutableStateFlow<ArticlesState> = MutableStateFlow(ArticlesState(loading = true))

    val articlesStates: StateFlow<ArticlesState>
        get() = _articlesState

    init {
        getArticles()
    }

    private fun getArticles(){
        scope.launch {
            val fetchedArticles = fetchArticles()

            delay(500)

            _articlesState.emit(ArticlesState(articles = fetchedArticles))
        }
    }

    suspend fun fetchArticles():List<Article> = mockArticles

    private val mockArticles = listOf(
        Article(
            title = "Exploring Jetpack Compose for Modern UI",
            description = "An in-depth guide to building reactive UIs with Jetpack Compose in Android.",
            date = "January 10, 2025",
            image = "https://example.com/images/jetpack_compose.png"
        ),
        Article(
            title = "Kotlin Multiplatform: Sharing Code Across Platforms",
            description = "Learn how Kotlin Multiplatform allows code sharing between Android and iOS.",
            date = "January 8, 2025",
            image = "https://example.com/images/kmm.png"
        ),
        Article(
            title = "Mastering Android Performance Optimization",
            description = "Tips and techniques for improving the performance of your Android apps.",
            date = "January 5, 2025",
            image = "https://example.com/images/performance.png"
        ),
        Article(
            title = "Understanding Coroutines in Kotlin",
            description = "Simplify asynchronous programming with Kotlin Coroutines.",
            date = "January 2, 2025",
            image = "https://example.com/images/coroutines.png"
        ),
        Article(
            title = "Design Patterns Every Android Developer Should Know",
            description = "Explore essential design patterns for scalable Android applications.",
            date = "December 30, 2024",
            image = "https://example.com/images/design_patterns.png"
        )
    )

}