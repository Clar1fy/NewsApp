package com.timplifier.newsapp.servicelocator

import com.timplifier.newsapp.presentation.fragments.NewsViewModel
import org.koin.dsl.module


val viewModelModule = module {
    factory { NewsViewModel(get()) }

}