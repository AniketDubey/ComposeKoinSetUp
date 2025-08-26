package com.example.composekoinsetup.data.repository

import com.example.composekoinsetup.data.datasource.RemoteDataSource
import com.example.composekoinsetup.domain.repository.SpotLightRepository
import com.example.composekoinsetup.data.dto.SpotlightDataListDTO
import kotlinx.coroutines.flow.Flow

class SpotLightRepositoryImpl (
    private val remoteDataSource: RemoteDataSource,
) : SpotLightRepository {
    override fun getSpotlightData(): Flow<SpotlightDataListDTO> {
        return remoteDataSource.getSpotLightData()
    }
}