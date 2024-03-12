package com.example.photonapp.ui.retrofit

import com.example.findmyip.data.local.UserResponse
import retrofit2.http.GET

interface ApiInterface {

    @GET("json")
    suspend fun getUserResponse(): UserResponse?

}