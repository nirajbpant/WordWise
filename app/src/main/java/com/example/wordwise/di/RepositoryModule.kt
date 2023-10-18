package com.example.wordwise.di

import com.example.wordwise.data.repository.WordInfoRepositoryImpl
import com.example.wordwise.domain.repository.IWordInfoRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWordInfoRepository(
        wordInfoRepositoryImpl: WordInfoRepositoryImpl
    ): IWordInfoRepository
}