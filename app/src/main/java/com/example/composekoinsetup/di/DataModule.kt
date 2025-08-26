package com.example.composekoinsetup.di

import com.example.composekoinsetup.data.datasource.RemoteDataSource
import com.example.composekoinsetup.data.datasource.RemoteDataSourceImpl
import com.example.composekoinsetup.data.repository.SpotLightRepositoryImpl
import com.example.composekoinsetup.domain.repository.SpotLightRepository
import org.koin.dsl.module

val dataModule = module {
    single<RemoteDataSource> { RemoteDataSourceImpl(get()) }
    single<SpotLightRepository> { SpotLightRepositoryImpl(get()) }
}