package com.timplifier.newsapp.data.remote.dtos

data class NewsResponse<T>(
    val status: String,
    val totalResults: String,
    val articles: List<T>
)

