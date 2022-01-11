package com.hunseong.bookbak.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.hunseong.bookbak.R
import com.hunseong.bookbak.databinding.ActivityMainBinding
import com.hunseong.bookbak.extensions.gone
import com.hunseong.bookbak.extensions.visible
import com.hunseong.bookbak.util.KeepStateNavigator

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initNavigation()
    }

    private fun initNavigation() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.main_container) as NavHostFragment
        val navController = navHostFragment.navController

        // 바텀 탭 제외 bottom nav gone 처리
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.books_fragment, R.id.report_fragment, R.id.favorite_fragment, R.id.my_fragment -> {
                    binding.bottomNav.visible()
                }
                else -> {
                    binding.bottomNav.gone()
                }
            }
        }

        val navigator = KeepStateNavigator(this, navHostFragment.childFragmentManager, R.id.main_container)
        navController.navigatorProvider.addNavigator(navigator)

        navController.setGraph(R.navigation.nav_graph)

        // 바텀 네비게이션 뷰와 navController 연결
        binding.bottomNav.setupWithNavController(navController)
    }
}