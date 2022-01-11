package com.hunseong.bookbak.ui.books

import com.hunseong.bookbak.databinding.FragmentBooksBinding
import com.hunseong.bookbak.ui.base.BaseFragment

class BooksFragment : BaseFragment<FragmentBooksBinding>() {

    override fun getViewBinding(): FragmentBooksBinding = FragmentBooksBinding.inflate(layoutInflater)
}