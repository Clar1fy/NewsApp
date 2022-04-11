package com.timplifier.newsapp.presentation.ui.fragments

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.newsapp.R
import com.timplifier.newsapp.base.BaseFragment
import com.timplifier.newsapp.databinding.FragmentBreakingNewsBinding
import com.timplifier.newsapp.presentation.ui.adapters.BreakingNewsAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class BreakingNewsFragment : BaseFragment<FragmentBreakingNewsBinding, NewsViewModel>(
    R.layout.fragment_breaking_news
) {

    override val binding by viewBinding(FragmentBreakingNewsBinding::bind)
    override val viewModel: NewsViewModel by viewModels()
    private val adapter = BreakingNewsAdapter(this::onItemClick)


    override fun setupViews() {
        setupAdapter()
    }

    private fun setupAdapter() {



    }


    override fun setupRequest() {
    }

    override fun setupObserver() {
    }

    private fun onItemClick(description: String) {

    }
}
