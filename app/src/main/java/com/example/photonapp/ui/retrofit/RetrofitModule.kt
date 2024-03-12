package com.example.photonapp.ui.retrofit

import com.example.photonapp.ui.di.AuthInterceptorOkHttpClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(ActivityComponent::class)
object RetrofitModule {

    @Provides
    fun provideApiService(
        @AuthInterceptorOkHttpClient okHttpClient: OkHttpClient,
        convertor: GsonConverterFactory
    ) : ApiInterface{
        return Retrofit.Builder()
            .baseUrl("https://example.co/")
            .client(okHttpClient)
            .addConverterFactory(convertor)
            .build()
            .create(ApiInterface::class.java)
    }

}