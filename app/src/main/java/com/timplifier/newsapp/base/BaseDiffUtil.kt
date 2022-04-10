package com.timplifier.newsapp.base

import androidx.recyclerview.widget.DiffUtil

class BaseDiffUtil<T : BaseDiffModel> : DiffUtil.ItemCallback<T>() {
    override fun areItemsTheSame(oldItem: T, newItem: T) =
        oldItem.url == newItem.url


    override fun areContentsTheSame(oldItem: T, newItem: T) =
        oldItem == newItem

}