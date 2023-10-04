package com.example.wordwise.domain.repository

import com.example.wordwise.data.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Result<List<WordInfo>>>

}