package com.timplifier.newsapp

import android.app.Application
import com.timplifier.newsapp.servicelocator.networkModule
import com.timplifier.newsapp.servicelocator.repositoryModule
import com.timplifier.newsapp.servicelocator.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.logger.AndroidLogger
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            AndroidLogger()
            androidContext(this@App)
            modules(networkModule, viewModelModule, repositoryModule)
        }
    }
}
