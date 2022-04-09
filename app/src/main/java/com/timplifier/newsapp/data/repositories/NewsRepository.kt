package com.timplifier.newsapp.data.repositories

import com.timplifier.newsapp.data.remote.apiservices.NewsApiService

class NewsRepository(private val newsApiService: NewsApiService) {
    suspend fun fetchNews() = newsApiService.fetchNews()
}