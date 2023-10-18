package com.example.wordwise.data.datasource

import com.example.wordwise.data.api.DictionaryApi
import com.example.wordwise.data.model.remote.WordInfoDTO

class WordInfoRemoteDataSourceImpl(
    private val api: DictionaryApi

): IWordInfoRemoteDataSource {
    override suspend fun getRemoteWordInfos(word: String): List<WordInfoDTO> {
        return api.getWordInfo(word = word)
    }
}