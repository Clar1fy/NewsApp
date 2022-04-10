package com.timplifier.newsapp.data.repositories

import com.timplifier.newsapp.base.BaseRepository
import com.timplifier.newsapp.data.local.room.daos.ArticleDao
import com.timplifier.newsapp.data.remote.apiservices.NewsApiService
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val newsApiService: NewsApiService,
    private val articleDao: ArticleDao
) : BaseRepository() {
    fun fetchBreakingNews() = sendRequest(

        {
            newsApiService.fetchBreakingNews()
        },
        { news ->
            articleDao.insertArticles(*news.articleDtos.toTypedArray())
        }
    )

    fun searchForNews(text: String) = sendRequest {
        newsApiService.searchForNews(text)
    }

    fun getBreakingNews() = sendRequest {
        articleDao.getArticles()
    }

}