package com.example.wordwise.domain.repository

import com.example.wordwise.data.model.Resource
import com.example.wordwise.data.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface IWordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>

}