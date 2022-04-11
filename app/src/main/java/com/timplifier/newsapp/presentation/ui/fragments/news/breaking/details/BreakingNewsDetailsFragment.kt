package com.timplifier.newsapp.presentation.ui.fragments.news.breaking.details

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.newsapp.R
import com.timplifier.newsapp.base.BaseFragment
import com.timplifier.newsapp.databinding.FragmentBreakingNewsDetailsBinding


class BreakingNewsDetailsFragment :
    BaseFragment<FragmentBreakingNewsDetailsBinding, BreakingNewsDetailsViewModel>
        (R.layout.fragment_breaking_news_details) {

    override val binding by viewBinding(FragmentBreakingNewsDetailsBinding::bind)
    override val viewModel: BreakingNewsDetailsViewModel by viewModels()


    override fun setupViews() {
    }

    override fun setupListeners() {
    }


}
