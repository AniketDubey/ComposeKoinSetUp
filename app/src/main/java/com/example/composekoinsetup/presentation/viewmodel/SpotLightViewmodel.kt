package com.example.composekoinsetup.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.composekoinsetup.domain.usecase.SpotLightDataUseCase
import com.example.composekoinsetup.presentation.entities.SpotLightPresentation
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SpotLightViewmodel(
    private val spotLightDataUseCase: SpotLightDataUseCase
) : ViewModel() {

    private val _spotLightListFlow = MutableStateFlow<List<SpotLightPresentation>>(emptyList())
    val spotLightListFlow = _spotLightListFlow.asStateFlow()


    fun getSpotLightData() {
        viewModelScope.launch {
            withContext(Dispatchers.IO) {
                spotLightDataUseCase.getSpotLightData().collect {
                    _spotLightListFlow.value = it!!
                }
            }
        }
    }
}