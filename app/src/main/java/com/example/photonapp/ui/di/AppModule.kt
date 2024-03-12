package com.example.photonapp.ui.di

import com.example.photonapp.ui.Helper
import com.example.photonapp.ui.sample.LoggerService
import com.example.photonapp.ui.sample.LoggerServiceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun providesHelper(loggerService: LoggerService) : Helper{
        return Helper(loggerService)
    }

    @Provides
    fun provideLoggerService() : LoggerService {
        return LoggerServiceImpl()
    }

}