package com.hunseong.bookbak.ui.login

import com.hunseong.bookbak.databinding.ActivityLoginBinding
import com.hunseong.bookbak.databinding.ActivitySplashBinding
import com.hunseong.bookbak.ui.base.BaseActivity

class LoginActivity : BaseActivity<ActivityLoginBinding>() {

    override fun getViewBinding(): ActivityLoginBinding = ActivityLoginBinding.inflate(layoutInflater)
}