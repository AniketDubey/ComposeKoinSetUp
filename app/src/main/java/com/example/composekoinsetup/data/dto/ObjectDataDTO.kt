package com.example.composekoinsetup.data.dto

import com.example.composekoinsetup.presentation.entities.ObjectDataPresentation


data class ObjectDataDTO(
    val lastUpdatedDate: Long?,
    val status: String?,
    val isVisibleInSpotLight: Boolean?
)

fun ObjectDataDTO.toDomain(): ObjectDataPresentation {
    return ObjectDataPresentation(
        lastUpdatedDate = lastUpdatedDate ?: 0,
        status = status ?: "",
        isVisibleInSpotLight = isVisibleInSpotLight ?: false,
    )
}