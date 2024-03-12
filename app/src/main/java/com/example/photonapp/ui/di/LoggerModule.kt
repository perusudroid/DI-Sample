package com.example.photonapp.ui.di

import com.example.photonapp.ui.sample.LoggerService
import com.example.photonapp.ui.sample.LoggerServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
abstract class LoggerModule {

    @Binds
    abstract fun bindLogger(loggerServiceImpl: LoggerServiceImpl): LoggerService

}