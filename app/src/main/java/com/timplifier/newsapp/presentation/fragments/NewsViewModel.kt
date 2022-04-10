package com.timplifier.newsapp.presentation.fragments

import com.timplifier.newsapp.base.BaseViewModel
import com.timplifier.newsapp.data.repositories.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    private val newsRepository: NewsRepository
) : BaseViewModel() {

    suspend fun fetchNews() = newsRepository.fetchNews()

}