package com.timplifier.newsapp.data.remote.apiservices

import com.timplifier.newsapp.common.constants.Constants.API_KEY
import com.timplifier.newsapp.data.remote.dtos.Article
import retrofit2.http.GET

interface NewsApiService {
    @GET(API_KEY)
    suspend fun fetchNews(): List<Article>


}