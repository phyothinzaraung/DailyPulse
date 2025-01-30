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
            delay(1000)

            _articlesState.emit(ArticlesState(error = "Something went wrong!"))

            val fetchedArticles = fetchArticles()

            _articlesState.emit(ArticlesState(articles = fetchedArticles))
        }
    }

    suspend fun fetchArticles():List<Article> = mockArticles

    private val mockArticles = listOf(
        Article(
            title = "Exploring Jetpack Compose for Modern UI",
            description = "An in-depth guide to building reactive UIs with Jetpack Compose in Android.",
            date = "January 10, 2025",
            image = "https://images.unsplash.com/photo-1607252650355-f7fd0460ccdb?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YW5kcm9pZHxlbnwwfHwwfHx8MA%3D%3D"
        ),
        Article(
            title = "Kotlin Multiplatform: Sharing Code Across Platforms",
            description = "Learn how Kotlin Multiplatform allows code sharing between Android and iOS.",
            date = "January 8, 2025",
            image = "https://images.unsplash.com/photo-1607252650355-f7fd0460ccdb?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YW5kcm9pZHxlbnwwfHwwfHx8MA%3D%3D"
        ),
        Article(
            title = "Mastering Android Performance Optimization",
            description = "Tips and techniques for improving the performance of your Android apps.",
            date = "January 5, 2025",
            image = "https://images.unsplash.com/photo-1607252650355-f7fd0460ccdb?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YW5kcm9pZHxlbnwwfHwwfHx8MA%3D%3D"
        ),
        Article(
            title = "Understanding Coroutines in Kotlin",
            description = "Simplify asynchronous programming with Kotlin Coroutines.",
            date = "January 2, 2025",
            image = "https://images.unsplash.com/photo-1607252650355-f7fd0460ccdb?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YW5kcm9pZHxlbnwwfHwwfHx8MA%3D%3D"
        ),
        Article(
            title = "Design Patterns Every Android Developer Should Know",
            description = "Explore essential design patterns for scalable Android applications.",
            date = "December 30, 2024",
            image = "https://images.unsplash.com/photo-1607252650355-f7fd0460ccdb?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8YW5kcm9pZHxlbnwwfHwwfHx8MA%3D%3D"
        )
    )

}