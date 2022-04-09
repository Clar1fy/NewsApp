package com.timplifier.newsapp.presentation.fragments

import com.timplifier.newsapp.base.BaseViewModel
import com.timplifier.newsapp.data.repositories.NewsRepository

class NewsViewModel(private val newsRepository: NewsRepository) : BaseViewModel() {

    suspend fun fetchNews() = newsRepository.fetchNews()

}