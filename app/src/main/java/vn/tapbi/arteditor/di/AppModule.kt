package vn.tapbi.arteditor.di

import android.app.Application
import android.content.SharedPreferences
import androidx.preference.PreferenceManager


import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import vn.tapbi.arteditor.common.Constant
import vn.tapbi.arteditor.data.local.SharedPreferenceHelper
import vn.tapbi.arteditor.data.local.db.MessageThreadDao
import vn.tapbi.arteditor.data.local.db.TapbiDb
import vn.tapbi.arteditor.data.local.db.UnSplashDao
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideShared(context: Application): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

    @Provides
    @Singleton
    fun provideSharedPreference(sharedPreferences: SharedPreferences): SharedPreferenceHelper {
        return SharedPreferenceHelper(sharedPreferences)
    }


    @Provides
    @Singleton
    fun provideRoomDbPhoto(context: Application): TapbiDb {
        return Room.databaseBuilder(context, TapbiDb::class.java, Constant.DB_PHOTO_NAME)
            .fallbackToDestructiveMigration().addMigrations(TapbiDb.MIGRATION_1_2).build()
    }

    @Provides
    @Singleton
    fun provideUnSplashDAO(db: TapbiDb): UnSplashDao {
        return db.unSplashDao
    }

}
