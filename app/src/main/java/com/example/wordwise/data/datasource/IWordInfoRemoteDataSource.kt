package com.example.wordwise.data.datasource

import com.example.wordwise.data.model.WordInfo
import com.example.wordwise.data.model.remote.WordInfoDTO
import kotlinx.coroutines.flow.Flow

interface IWordInfoRemoteDataSource {
    suspend fun getRemoteWordInfos(word: String): List<WordInfoDTO>
}