package vn.tapbi.arteditor.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nJ\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J!\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lvn/tapbi/arteditor/data/repository/UnSplashPhotoRepository;", "", "unsplashApi", "Lvn/tapbi/arteditor/data/remote/UnsplashApi;", "tapbiDb", "Lvn/tapbi/arteditor/data/local/db/TapbiDb;", "(Lvn/tapbi/arteditor/data/remote/UnsplashApi;Lvn/tapbi/arteditor/data/local/db/TapbiDb;)V", "getTapbiDb", "()Lvn/tapbi/arteditor/data/local/db/TapbiDb;", "getAllPhotos", "Landroidx/lifecycle/LiveData;", "", "Lvn/tapbi/arteditor/data/model/UnsplashPhotoModel;", "getPhotosByCategory", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "category", "", "refreshPhotos", "", "clientId", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_devDebug"})
public final class UnSplashPhotoRepository {
    private final vn.tapbi.arteditor.data.remote.UnsplashApi unsplashApi = null;
    @org.jetbrains.annotations.NotNull
    private final vn.tapbi.arteditor.data.local.db.TapbiDb tapbiDb = null;
    
    @javax.inject.Inject
    public UnSplashPhotoRepository(@org.jetbrains.annotations.NotNull
    vn.tapbi.arteditor.data.remote.UnsplashApi unsplashApi, @org.jetbrains.annotations.NotNull
    vn.tapbi.arteditor.data.local.db.TapbiDb tapbiDb) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.tapbi.arteditor.data.local.db.TapbiDb getTapbiDb() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<vn.tapbi.arteditor.data.model.UnsplashPhotoModel>> getAllPhotos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<vn.tapbi.arteditor.data.model.UnsplashPhotoModel>> getPhotosByCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object refreshPhotos(@org.jetbrains.annotations.NotNull
    java.lang.String clientId, @org.jetbrains.annotations.NotNull
    java.lang.String category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}