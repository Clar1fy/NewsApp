package com.timplifier.newsapp.servicelocator

import com.timplifier.newsapp.data.repositories.NewsRepository
import org.koin.dsl.module


val repositoryModule = module {
    factory { NewsRepository(get()) }
}