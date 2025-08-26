package com.example.composekoinsetup.data.dto

import com.example.composekoinsetup.presentation.entities.SpotLightDataListPresentation

data class SpotlightDataListDTO(
    val lastSyncDate: Long?,
    val nextLink: String?,
    val spotLights: List<SpotLightDTO>?
)

fun SpotlightDataListDTO.toDomain(): SpotLightDataListPresentation {
    return SpotLightDataListPresentation(
        lastSyncDate = lastSyncDate ?: 0,
        nextLink = nextLink ?: "",
        spotLights = spotLights?.map { it.toDomain() } ?: emptyList()
    )
}