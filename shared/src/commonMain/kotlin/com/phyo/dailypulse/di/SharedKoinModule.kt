package com.phyo.dailypulse.di

import com.phyo.dailypulse.articles.di.articlesModule

val sharedKoinModule = listOf(
    articlesModule,
    networkModule
)