package com.example.composekoinsetup.domain.usecase

import com.example.composekoinsetup.data.dto.toDomain
import com.example.composekoinsetup.domain.repository.SpotLightRepository
import kotlinx.coroutines.flow.flow

class SpotLightDataUseCase(
    private val spotLightRepository: SpotLightRepository
) {
    fun getSpotLightData() = flow {
        spotLightRepository.getSpotlightData().collect { it ->
            val ani = it.spotLights?.map { it.toDomain() }
            emit(ani)
        }
    }
}