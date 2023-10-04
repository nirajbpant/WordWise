package com.example.wordwise.data.api

import com.example.wordwise.data.model.remote.WordInfoDTO
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryApi {

    @GET("/api/v2/entries/en/{word}")
    suspend fun getWordInfo(
        @Path("word") word: String
    ) : List<WordInfoDTO>
}