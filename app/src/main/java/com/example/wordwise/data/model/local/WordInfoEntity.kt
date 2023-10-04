package com.example.wordwise.data.model.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.wordwise.data.model.Meaning
import com.example.wordwise.data.model.WordInfo

@Entity
data class WordInfoEntity(
    val word: String,
    val phonetic: String,
    val origin: String,
    //Skipping relationship database for simplicy
    val meanings: List<Meaning>,
    @PrimaryKey val id: Int?= null
){
    fun toWordInfo() : WordInfo{
        return WordInfo(
            meanings = meanings,
            word = word,
            origin =  origin,
            phonetic =  phonetic
        )
    }
}
