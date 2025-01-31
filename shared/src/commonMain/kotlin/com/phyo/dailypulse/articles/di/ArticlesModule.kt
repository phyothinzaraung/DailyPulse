package com.phyo.dailypulse.articles.di

import com.phyo.dailypulse.articles.ArticlesService
import com.phyo.dailypulse.articles.ArticlesUseCase
import com.phyo.dailypulse.articles.ArticlesViewModel
import org.koin.dsl.module

val articlesModule = module {

    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
}