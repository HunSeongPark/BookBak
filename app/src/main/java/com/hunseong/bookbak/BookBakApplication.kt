package com.hunseong.bookbak

import android.app.Application
import timber.log.Timber

class BookBakApplication : Application() {
    override fun onCreate() {
        if(BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        super.onCreate()
    }
}