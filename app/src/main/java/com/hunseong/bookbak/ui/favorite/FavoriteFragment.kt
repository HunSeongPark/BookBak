package com.hunseong.bookbak.ui.favorite

import com.hunseong.bookbak.databinding.FragmentBooksBinding
import com.hunseong.bookbak.databinding.FragmentFavoriteBinding
import com.hunseong.bookbak.ui.base.BaseFragment

class FavoriteFragment : BaseFragment<FragmentFavoriteBinding>() {

    override fun getViewBinding(): FragmentFavoriteBinding = FragmentFavoriteBinding.inflate(layoutInflater)
}