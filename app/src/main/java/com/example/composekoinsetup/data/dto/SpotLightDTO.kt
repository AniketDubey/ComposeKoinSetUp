package com.example.composekoinsetup.data.dto

import com.example.composekoinsetup.presentation.entities.SpotLightPresentation

data class SpotLightDTO(
    val thumbnailUrl: String?,
    val isSeen: Boolean?,
    val objects: List<ObjectDataDTO>?
)

fun SpotLightDTO.toDomain(): SpotLightPresentation {
    return SpotLightPresentation(
        thumbnailUrl = thumbnailUrl ?: "",
        isSeen = isSeen ?: false,
        objects = objects?.map { it.toDomain() } ?: emptyList(),
    )
}