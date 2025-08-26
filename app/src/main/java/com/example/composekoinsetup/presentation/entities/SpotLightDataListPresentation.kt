package com.example.composekoinsetup.presentation.entities

data class SpotLightDataListPresentation(
    val lastSyncDate: Long,
    val nextLink: String,
    val spotLights: List<SpotLightPresentation>
)