package com.example.wordwise.data.datasource

import com.example.wordwise.data.model.local.WordInfoEntity

interface IWordInfoLocalDataSource {
    suspend fun getLocalWordInfos(word: String): List<WordInfoEntity>
}