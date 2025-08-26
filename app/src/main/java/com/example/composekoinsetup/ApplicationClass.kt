package com.example.composekoinsetup

import android.app.Application
import com.example.composekoinsetup.di.dataModule
import com.example.composekoinsetup.di.domainModule
import com.example.composekoinsetup.di.networkModule
import com.example.composekoinsetup.di.uiModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ApplicationClass : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ApplicationClass)
            modules(
                dataModule,
                domainModule,
                networkModule,
                uiModule
            )
        }
    }
}