package vn.tapbi.arteditor.di

import javax.inject.Singleton


import dagger.Module

import dagger.Provides

import dagger.hilt.InstallIn

import dagger.hilt.components.SingletonComponent

import okhttp3.OkHttpClient

import okhttp3.logging.HttpLoggingInterceptor

import retrofit2.Retrofit

import retrofit2.converter.gson.GsonConverterFactory
import vn.tapbi.arteditor.common.Constant
import vn.tapbi.arteditor.data.remote.UnsplashApi
import java.util.concurrent.TimeUnit


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun providesRetrofit(
        okHttpClient: OkHttpClient?
    ): Retrofit {
        return Retrofit.Builder().baseUrl(Constant.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

    @Provides
    @Singleton
    fun providesUnsplashApi(retrofit: Retrofit): UnsplashApi {
        return retrofit.create(UnsplashApi::class.java)
    }


    @Provides
    @Singleton
    fun providesOkHttpClientAppVersion(): OkHttpClient? {
        // SSLv3, TLSv1, TLSv1.1, TLSv1.2 etc.
        // SSLv3, TLSv1, TLSv1.1, TLSv1.2 etc.
        val client: OkHttpClient.Builder = OkHttpClient.Builder()
            .connectTimeout(Constant.CONNECT_S.toLong(), TimeUnit.SECONDS)
            .writeTimeout(Constant.WRITE_S.toLong(), TimeUnit.SECONDS)
            .readTimeout(Constant.READ_S.toLong(), TimeUnit.SECONDS)
        val interceptor = HttpLoggingInterceptor()
        interceptor.setLevel(HttpLoggingInterceptor.Level.BASIC)
        client.addNetworkInterceptor(interceptor)
        return client.build()
    }

}
