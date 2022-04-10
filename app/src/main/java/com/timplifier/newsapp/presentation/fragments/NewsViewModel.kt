package com.timplifier.newsapp.presentation.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.timplifier.newsapp.base.BaseViewModel
import com.timplifier.newsapp.data.remote.dtos.ArticleDto
import com.timplifier.newsapp.data.remote.dtos.NewsResponse
import com.timplifier.newsapp.data.repositories.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val newsRepository: NewsRepository
) : BaseViewModel() {

    private var page: Int = 0
    var isLoading: Boolean = false
    private val _newsState = MutableLiveData<NewsResponse<ArticleDto>>()
    var newsState: LiveData<NewsResponse<ArticleDto>> = _newsState

    private val _localNewsState = MutableLiveData<List<ArticleDto>>()
    var localNewsState: LiveData<List<ArticleDto>> = _localNewsState

    fun fetchBreakingNews() {
        isLoading = true
        newsRepository.fetchBreakingNews().gather(_newsState) {
            page++
            isLoading = false
        }
    }

    fun getBreakingNews() = newsRepository.getBreakingNews().gather(_localNewsState)

}