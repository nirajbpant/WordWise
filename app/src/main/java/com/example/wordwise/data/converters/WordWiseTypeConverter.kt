package com.example.wordwise.data.converters

import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import com.example.wordwise.data.model.Meaning
import com.google.gson.reflect.TypeToken

@ProvidedTypeConverter
class WordWiseTypeConverter(
    private val jsonParser: JsonParser
) {

    @TypeConverter
    fun fromMeaningsJson(json: String) : List<Meaning>{
        return jsonParser.fromJson<ArrayList<Meaning>>(
            json,
            object : TypeToken<ArrayList<Meaning>>(){}.type
        ) ?: emptyList()
    }

    @TypeConverter
    fun toMeaningsJson(meanings: List<Meaning>): String{
        return jsonParser.toJson(
            meanings,
            object : TypeToken<ArrayList<Meaning>>(){}.type
        ) ?: "[]"
    }
}