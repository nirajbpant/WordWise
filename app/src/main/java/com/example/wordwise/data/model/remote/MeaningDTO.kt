package com.example.wordwise.data.model.remote

import com.example.wordwise.data.model.Meaning

data class MeaningDTO(
    val definitions: List<DefinitionDTO>,
    val partOfSpeech: String
){
    fun toMeaning() : Meaning{
        return Meaning(
            definitions = definitions.map { it.toDefinition() },
            partOfSpeech = partOfSpeech
        )
    }
}