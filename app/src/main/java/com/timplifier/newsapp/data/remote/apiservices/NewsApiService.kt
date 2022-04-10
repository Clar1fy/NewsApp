package com.timplifier.newsapp.data.remote.apiservices

import com.timplifier.newsapp.common.constants.Constants.API_KEY
import com.timplifier.newsapp.data.remote.dtos.ArticleDto
import com.timplifier.newsapp.data.remote.dtos.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {
    @GET("v2/top-headlines")
    suspend fun fetchBreakingNews(
        @Query("country") countryCode: String = "us",
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = API_KEY
    ): NewsResponse<ArticleDto>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("q") searchQuery: String,
        @Query("page") page: Int = 1,
        @Query("apiKey") apiKey: String = API_KEY
    ): NewsResponse<ArticleDto>


}