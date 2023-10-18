package com.example.wordwise.data.repository
import com.example.wordwise.data.datasource.IWordInfoLocalDataSource
import com.example.wordwise.data.datasource.IWordInfoRemoteDataSource
import com.example.wordwise.data.model.Resource
import com.example.wordwise.data.model.WordInfo
import com.example.wordwise.domain.repository.IWordInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class WordInfoRepositoryImpl(
    private val wordInfoLocalDataSource: IWordInfoLocalDataSource,
    private val wordInfoRemoteDataSource: IWordInfoRemoteDataSource,
): IWordInfoRepository {
    override fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>> = flow {
        emit(Resource.Loading())

        val cachedWordInfoData = wordInfoLocalDataSource.getLocalWordInfos(word = word).map { it.toWordInfo() }
        emit(Resource.Loading(data = cachedWordInfoData))

        try {
            val remoteWordInfoData = wordInfoRemoteDataSource.getRemoteWordInfos(word =  word)
            //Todo DELETE & INSERT NEW WORDINFODATA WHILE EMITTING NEW STATE
            emit(Resource.Success(data = listOf()))
        } catch (e: HttpException){
            emit(Resource.Error(
                message = "Oops Something Went Wrong",
                data = cachedWordInfoData
                ))
        } catch (e: IOException){
            emit(Resource.Error(
                message = "Couldn't reach the server. Please check your connection",
                data = cachedWordInfoData
            ))
        }

    }
}