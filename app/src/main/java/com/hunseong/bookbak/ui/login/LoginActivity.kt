package com.hunseong.bookbak.ui.login

import android.content.Intent
import android.os.Bundle
import com.hunseong.bookbak.databinding.ActivityLoginBinding
import com.hunseong.bookbak.databinding.ActivitySplashBinding
import com.hunseong.bookbak.ui.base.BaseActivity
import com.hunseong.bookbak.ui.signup.SignupActivity

class LoginActivity : BaseActivity<ActivityLoginBinding>() {

    override fun getViewBinding(): ActivityLoginBinding = ActivityLoginBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViews()
    }

    private fun initViews() = with(binding) {
        emailSignupBtn.setOnClickListener {
            val intent = Intent(this@LoginActivity, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}