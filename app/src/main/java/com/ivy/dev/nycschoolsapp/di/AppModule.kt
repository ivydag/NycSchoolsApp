package com.ivy.dev.nycschoolsapp.di

import android.app.Application
import android.content.Context
import com.ivy.dev.nycschoolsapp.data.remote.ApiHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideContext(application: Application): Context = application.applicationContext

    @Provides
    @Singleton
    fun provideDataManager(apiHelper: ApiHelper, databaseHelper: DatabaseHelper): DataManager {
        return DataManagerImpl(apiHelper, databaseHelper)
    }
}