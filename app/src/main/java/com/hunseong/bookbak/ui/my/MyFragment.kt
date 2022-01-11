package com.hunseong.bookbak.ui.my

import com.hunseong.bookbak.databinding.FragmentBooksBinding
import com.hunseong.bookbak.databinding.FragmentFavoriteBinding
import com.hunseong.bookbak.databinding.FragmentMyBinding
import com.hunseong.bookbak.ui.base.BaseFragment

class MyFragment : BaseFragment<FragmentMyBinding>() {

    override fun getViewBinding(): FragmentMyBinding = FragmentMyBinding.inflate(layoutInflater)
}