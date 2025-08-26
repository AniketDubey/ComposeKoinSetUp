package com.example.composekoinsetup.presentation.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.composekoinsetup.presentation.viewmodel.SpotLightViewmodel
import org.koin.compose.viewmodel.koinViewModel

@Composable
fun HomeScreen(modifier: Modifier) {
    val viewmodel = koinViewModel<SpotLightViewmodel>()
    LaunchedEffect(Unit) {
        viewmodel.getSpotLightData()
    }
    val memoriesData = viewmodel.spotLightListFlow.collectAsStateWithLifecycle().value
    LazyColumn(modifier = modifier.fillMaxSize()) {
        items(memoriesData.size) {
            Text(text = memoriesData[it].thumbnailUrl)
        }
    }
}