package com.timplifier.newsapp.presentation.fragments

import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.newsapp.R
import com.timplifier.newsapp.base.BaseFragment
import com.timplifier.newsapp.databinding.FragmentNewsBinding
import com.timplifier.newsapp.presentation.adapters.NewsAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

@AndroidEntryPoint
class NewsFragment : BaseFragment<FragmentNewsBinding, NewsViewModel>(
    R.layout.fragment_news
) {

    override val binding by viewBinding(FragmentNewsBinding::bind)
    override val viewModel: NewsViewModel by viewModel()
    private val adapter = NewsAdapter()


    override fun setupViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        lifecycleScope.launch {


            viewModel.fetchNews()
            adapter.setList(viewModel.fetchNews())
        }
    }


    override fun setupRequest() {
    }

    override fun setupObserver() {
    }
}
