package com.example.composekoinsetup.di

import com.example.composekoinsetup.domain.usecase.SpotLightDataUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { SpotLightDataUseCase(get()) }
}