package com.timplifier.newsapp.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.timplifier.newsapp.data.remote.dtos.ArticleDto
import com.timplifier.newsapp.databinding.ItemNewsBinding

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {
    private var list: List<ArticleDto> = ArrayList()


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
        holder.onBind(list[position])
    }

    fun setList(list: List<ArticleDto>) {

        this.list = list
    }

    override fun getItemCount(): Int = list.size


    inner class NewsViewHolder(private val binding: ItemNewsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(articleDto: ArticleDto) {
            binding.apply {

            }


        }


    }
}
