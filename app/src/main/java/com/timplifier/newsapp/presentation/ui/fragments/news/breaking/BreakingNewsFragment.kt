package com.timplifier.newsapp.presentation.ui.fragments.news.breaking

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.newsapp.R
import com.timplifier.newsapp.base.BaseFragment
import com.timplifier.newsapp.common.extensions.isInternetAvailable
import com.timplifier.newsapp.common.extensions.submitData
import com.timplifier.newsapp.databinding.FragmentBreakingNewsBinding
import com.timplifier.newsapp.presentation.ui.adapters.BreakingNewsAdapter
import com.timplifier.newsapp.utils.PaginationScrollListener
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class BreakingNewsFragment : BaseFragment<FragmentBreakingNewsBinding, NewsViewModel>(
    R.layout.fragment_breaking_news
) {

    override val binding by viewBinding(FragmentBreakingNewsBinding::bind)
    override val viewModel: NewsViewModel by viewModels()
    private val newsAdapter = BreakingNewsAdapter(this::onItemClick)


    override fun setupViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        binding.recyclerview.apply {
            adapter = newsAdapter
            val linearLayoutManager = LinearLayoutManager(context)
            layoutManager = linearLayoutManager
            addOnScrollListener(object : PaginationScrollListener(linearLayoutManager,
                {
                    if (isInternetAvailable(context))
                        viewModel.fetchBreakingNews() else viewModel.getBreakingNews()


                }) {
                override fun isLoading() = viewModel.isLoading
            })
        }


    }


    override fun setupRequest() {
        if (viewModel.newsState.value == null && isInternetAvailable(context))
            viewModel.fetchBreakingNews()
        else
            viewModel.getBreakingNews()
    }

    override fun setupObserver() {
        fetchNews()
        gatherLocalNews()

    }

    private fun fetchNews() {
        lifecycleScope.launch {
            viewModel.newsState.observe(viewLifecycleOwner) {
                newsAdapter.submitData(it.articleDtos)
            }
        }
    }

    private fun gatherLocalNews() {
        lifecycleScope.launch {
            viewModel.localNewsState.observe(viewLifecycleOwner) {
                newsAdapter.submitData(it)
            }
        }
    }

    private fun onItemClick(description: String) {

    }
}
