package com.timplifier.newsapp.servicelocator

import com.timplifier.newsapp.data.remote.RetrofitClient
import org.koin.dsl.module


val networkModule = module {
    single { RetrofitClient() }
    single { get<RetrofitClient>().provideNewsApiService() }

}