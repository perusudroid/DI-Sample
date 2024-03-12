package com.example.findmyip.domain

import com.example.findmyip.data.remote.ApiService

class FindMyIpRepo(private val apiService : ApiService) {

    suspend fun fetchAPI() = apiService.getUserResponse()

}