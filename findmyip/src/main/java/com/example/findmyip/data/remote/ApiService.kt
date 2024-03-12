package com.example.findmyip.data.remote

import com.example.findmyip.data.local.UserResponse
import retrofit2.http.GET

interface ApiService {
    @GET("json")
    suspend fun getUserResponse(): UserResponse?
}