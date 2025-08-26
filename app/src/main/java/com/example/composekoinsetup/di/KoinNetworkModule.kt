package com.example.composekoinsetup.di

import com.example.composekoinsetup.data.ApiService
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {

    // ApiKeyInterceptor
    single<Interceptor> { ApiKeyInterceptor() }

    // OkHttpClient
    single {
        OkHttpClient.Builder()
            .addInterceptor(get<Interceptor>()) // apiKeyInterceptor
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
            .build()
    }

    // Retrofit
    single {
        Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com/")
            .client(get())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    // ApiService
    single<ApiService> {
        get<Retrofit>().create(ApiService::class.java)
    }
}
