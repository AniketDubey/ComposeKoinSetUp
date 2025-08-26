package com.example.composekoinsetup.data.datasource

import com.example.composekoinsetup.data.ApiService
import com.example.composekoinsetup.data.dto.SpotlightDataListDTO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class RemoteDataSourceImpl(private val api: ApiService) : RemoteDataSource {
    override fun getSpotLightData(): Flow<SpotlightDataListDTO> {
        return flow {
            val response = api.getSpotlightData()
        }
    }
}