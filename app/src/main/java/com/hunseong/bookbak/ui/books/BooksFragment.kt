package com.hunseong.bookbak.ui.books

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hunseong.bookbak.databinding.FragmentBooksBinding
import com.hunseong.bookbak.ui.base.BaseFragment
import timber.log.Timber

class BooksFragment : BaseFragment<FragmentBooksBinding>() {

    override fun getBinding(): FragmentBooksBinding = FragmentBooksBinding.inflate(layoutInflater)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        Timber.tag("onCreate").d("onCreate - Books")
        return super.onCreateView(inflater, container, savedInstanceState)
    }
}