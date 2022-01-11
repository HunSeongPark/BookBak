package com.hunseong.bookbak.ui.signup

import com.hunseong.bookbak.databinding.ActivitySignupBinding
import com.hunseong.bookbak.ui.base.BaseActivity

class SignupActivity : BaseActivity<ActivitySignupBinding>() {
    override fun getViewBinding(): ActivitySignupBinding = ActivitySignupBinding.inflate(layoutInflater)
}