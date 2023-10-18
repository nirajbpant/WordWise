package com.example.wordwise.di

import com.example.wordwise.data.datasource.IWordInfoLocalDataSource
import com.example.wordwise.data.datasource.IWordInfoRemoteDataSource
import com.example.wordwise.data.datasource.WordInfoLocalDataSourceImpl
import com.example.wordwise.data.datasource.WordInfoRemoteDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataSourceModule {

    @Binds
    @Singleton
    abstract fun bindWordInfoRemoteDataSource(
        wordInfoRemoteDataSourceImpl: WordInfoRemoteDataSourceImpl
    ): IWordInfoRemoteDataSource

    @Binds
    @Singleton
    abstract  fun bindWordInfoLocalDataSource(
        wordInfoLocalDataSourceImpl: WordInfoLocalDataSourceImpl
    ): IWordInfoLocalDataSource
}