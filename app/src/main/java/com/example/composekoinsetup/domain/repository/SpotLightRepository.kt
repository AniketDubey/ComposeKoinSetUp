package com.example.composekoinsetup.domain.repository

import com.example.composekoinsetup.data.dto.SpotlightDataListDTO
import kotlinx.coroutines.flow.Flow

interface SpotLightRepository {
    fun getSpotlightData(): Flow<SpotlightDataListDTO>
}