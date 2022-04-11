package com.timplifier.newsapp.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.timplifier.newsapp.base.BaseDiffUtil
import com.timplifier.newsapp.common.extensions.requestImage
import com.timplifier.newsapp.data.remote.dtos.ArticleDto
import com.timplifier.newsapp.databinding.ItemNewsBinding

class BreakingNewsAdapter(
    private val onItemClick: (url: String) -> Unit
) : ListAdapter<ArticleDto, BreakingNewsAdapter.NewsViewHolder>(BaseDiffUtil()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(
            ItemNewsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }


    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        getItem(position).let { holder.onBind(it) }
    }


    inner class NewsViewHolder(private val binding: ItemNewsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(articleDto: ArticleDto) {
            binding.apply {
                imNews.requestImage(articleDto.urlToImage)
                tvTitle.text = articleDto.title
                tvDescription.text = articleDto.description
                tvAuthor.text = articleDto.author
                tvPublicationDate.text = articleDto.publishedAt

                root.setOnClickListener {
                    onItemClick(articleDto.url)
                }
            }


        }


    }
}
