package com.example.composekoinsetup.data

import com.example.composekoinsetup.data.dto.SpotlightDataListDTO
import com.example.composekoinsetup.data.dto.ViewedRequestBodyDTO
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @GET("posts")
    suspend fun getSpotlightData(): Response<SpotlightDataListDTO>

    @POST("")
    suspend fun setSpotlightViewed(@Body data: ViewedRequestBodyDTO): Response<Void>
}