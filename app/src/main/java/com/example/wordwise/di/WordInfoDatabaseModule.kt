package com.example.wordwise.di

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import com.example.wordwise.data.WordInfoDAO
import com.example.wordwise.data.converters.WordWiseTypeConverter
import com.example.wordwise.data.model.local.WordInfoEntity

@Database(
    entities = [WordInfoEntity::class],
    version = 1
)
@TypeConverters(WordWiseTypeConverter::class)
abstract class WordInfoDatabaseModule :RoomDatabase(){
    abstract  val dao: WordInfoDAO
}