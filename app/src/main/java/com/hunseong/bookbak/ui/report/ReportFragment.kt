package com.hunseong.bookbak.ui.report

import com.hunseong.bookbak.databinding.FragmentBooksBinding
import com.hunseong.bookbak.databinding.FragmentFavoriteBinding
import com.hunseong.bookbak.databinding.FragmentReportBinding
import com.hunseong.bookbak.ui.base.BaseFragment

class ReportFragment : BaseFragment<FragmentReportBinding>() {

    override fun getViewBinding(): FragmentReportBinding = FragmentReportBinding.inflate(layoutInflater)
}