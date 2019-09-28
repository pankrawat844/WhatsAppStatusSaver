package com.app.statussaver.utils

//import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface Api {

//    @GET("livematches.json")
//    suspend fun getAllMatchesAsync(): Response<List<LiveMatches>>

//    companion object
//    {
//        operator fun invoke(
//                connectivityInterceptor: ConnectivityInterceptor
//        ):Api
//        {
//            val okhttpclient=OkHttpClient.
//                    Builder()
//                    .addInterceptor(connectivityInterceptor)
//                    .build()
//            return  Retrofit.Builder()
//                    .addCallAdapterFactory(CoroutineCallAdapterFactory())
//                    .addConverterFactory(GsonConverterFactory.create())
//                    .baseUrl("")
//                    .build()
//                    .create(Api::class.java)
//        }
//    }
}