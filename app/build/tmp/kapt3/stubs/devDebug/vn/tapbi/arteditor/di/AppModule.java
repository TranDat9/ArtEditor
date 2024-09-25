package vn.tapbi.arteditor.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u0007\u00a8\u0006\u000f"}, d2 = {"Lvn/tapbi/arteditor/di/AppModule;", "", "()V", "provideRoomDbPhoto", "Lvn/tapbi/arteditor/data/local/db/TapbiDb;", "context", "Landroid/app/Application;", "provideShared", "Landroid/content/SharedPreferences;", "provideSharedPreference", "Lvn/tapbi/arteditor/data/local/SharedPreferenceHelper;", "sharedPreferences", "provideUnSplashDAO", "Lvn/tapbi/arteditor/data/local/db/UnSplashDao;", "db", "app_devDebug"})
@dagger.Module
public final class AppModule {
    
    public AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final android.content.SharedPreferences provideShared(@org.jetbrains.annotations.NotNull
    android.app.Application context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final vn.tapbi.arteditor.data.local.SharedPreferenceHelper provideSharedPreference(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final vn.tapbi.arteditor.data.local.db.TapbiDb provideRoomDbPhoto(@org.jetbrains.annotations.NotNull
    android.app.Application context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final vn.tapbi.arteditor.data.local.db.UnSplashDao provideUnSplashDAO(@org.jetbrains.annotations.NotNull
    vn.tapbi.arteditor.data.local.db.TapbiDb db) {
        return null;
    }
}