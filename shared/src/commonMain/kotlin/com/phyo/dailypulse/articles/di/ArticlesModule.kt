package com.phyo.dailypulse.articles.di

import com.phyo.dailypulse.data.ArticlesService
import com.phyo.dailypulse.application.ArticlesUseCase
import com.phyo.dailypulse.data.ArticlesViewModel
import org.koin.dsl.module

val articlesModule = module {

    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
}