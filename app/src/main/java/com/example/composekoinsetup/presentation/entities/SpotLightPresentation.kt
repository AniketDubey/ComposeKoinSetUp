package com.example.composekoinsetup.presentation.entities

data class SpotLightPresentation(
    val thumbnailUrl: String,
    val isSeen: Boolean,
    val objects: List<ObjectDataPresentation>
)
