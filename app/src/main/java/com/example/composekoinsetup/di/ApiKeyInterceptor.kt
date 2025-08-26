package com.example.composekoinsetup.di

import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class ApiKeyInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val accessToken = "" // ACCESS TOKEN
        val userId=""// userID


        val deviceKey = ""
        val request: Request = chain.request()
            .newBuilder()
            .addHeader("Authorization", "Basic " + accessToken)
            .build()

        return chain.proceed(request)
    }
}