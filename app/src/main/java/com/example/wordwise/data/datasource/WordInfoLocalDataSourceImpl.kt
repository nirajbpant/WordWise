package com.example.wordwise.data.datasource

import com.example.wordwise.data.WordInfoDAO
import com.example.wordwise.data.model.local.WordInfoEntity

class WordInfoLocalDataSourceImpl(
    private val wordInfoDAO: WordInfoDAO
): IWordInfoLocalDataSource {

    override suspend fun getLocalWordInfos(word: String): List<WordInfoEntity> {
       return wordInfoDAO.getWordInfos(word = word)
    }
}