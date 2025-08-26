package com.example.composekoinsetup.di

import com.example.composekoinsetup.presentation.viewmodel.SpotLightViewmodel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val uiModule = module {
    viewModel { SpotLightViewmodel(get()) }
}