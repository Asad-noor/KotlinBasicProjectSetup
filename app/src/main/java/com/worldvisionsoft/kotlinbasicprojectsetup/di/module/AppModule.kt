package com.worldvisionsoft.kotlinbasicprojectsetup.di.module

import android.app.Application
import androidx.room.Room
import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.worldvisionsoft.kotlinbasicprojectsetup.BuildConfig
import com.worldvisionsoft.kotlinbasicprojectsetup.data.AppDataManager
import com.worldvisionsoft.kotlinbasicprojectsetup.data.DataManager
import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db.AppDatabase
import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db.AppDbHelper
import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.db.DbHelper
import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.pref.AppPreferencesHelper
import com.worldvisionsoft.kotlinbasicprojectsetup.data.local.pref.PreferencesHelper
import com.worldvisionsoft.kotlinbasicprojectsetup.data.remote.ApiEndPoint
import com.worldvisionsoft.kotlinbasicprojectsetup.data.remote.ApiHelper
import com.worldvisionsoft.kotlinbasicprojectsetup.data.remote.ApiService
import com.worldvisionsoft.kotlinbasicprojectsetup.data.remote.AppApiHelper
import com.worldvisionsoft.kotlinbasicprojectsetup.di.DatabaseInfo
import com.worldvisionsoft.kotlinbasicprojectsetup.di.PreferenceInfo
import com.worldvisionsoft.kotlinbasicprojectsetup.utils.AppConstants
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    internal fun provideContext(application: Application): Context = application

    @Provides
    @Singleton
    internal fun provideAppDataManager(appDataManager: AppDataManager): DataManager = appDataManager


    @Provides
    @Singleton
    internal fun provideApiHelper(appApiHelper: AppApiHelper): ApiHelper = appApiHelper


    //pref
    @Provides
    @PreferenceInfo
    internal fun providePreferenceName(): String = AppConstants.PREF_NAME

    @Provides
    @Singleton
    internal fun providePreferencesHelper(appPreferencesHelper: AppPreferencesHelper): PreferencesHelper =
        appPreferencesHelper


    //database
    @Provides
    @DatabaseInfo
    internal fun provideDbName(): String = AppConstants.DB_NAME

    @Provides
    @Singleton
    internal fun provideDbHelper(appDbHelper: AppDbHelper): DbHelper = appDbHelper

    @Provides
    @Singleton
    internal fun provideAppDatabase(@DatabaseInfo dbName: String, context: Context): AppDatabase =
        Room.databaseBuilder(context, AppDatabase::class.java, dbName).fallbackToDestructiveMigration()
            .build()



    //network part
    @Provides
    @Singleton
    internal fun provideGson(): Gson {
        return GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
    }

    @Provides
    @Singleton
    internal fun provideOkhttpClient(): OkHttpClient = OkHttpClient.Builder()
            //.addInterceptor(provideHttpLoggingInterceptor())
            .connectTimeout(30, TimeUnit.SECONDS)
            .build()

    @Provides
    @Singleton
    internal fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(provideGson()))
            .baseUrl(BuildConfig.BASE_URL)
            .client(okHttpClient)
            .build()

    @Provides
    @Singleton
    internal fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)
}