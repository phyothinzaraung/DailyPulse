package com.phyo.dailypulse.android

import android.app.Application
import com.phyo.dailypulse.android.di.viewModelsModule
import com.phyo.dailypulse.di.sharedKoinModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class DailyPulseApp: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin(){
        val modules = sharedKoinModule + viewModelsModule
        startKoin {
            androidContext(this@DailyPulseApp)
            modules(modules)
        }
    }
}