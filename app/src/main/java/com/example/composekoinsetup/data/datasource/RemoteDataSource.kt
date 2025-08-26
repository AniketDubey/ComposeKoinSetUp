package com.example.composekoinsetup.data.datasource

import com.example.composekoinsetup.data.dto.SpotlightDataListDTO
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {
    fun getSpotLightData(): Flow<SpotlightDataListDTO>
}