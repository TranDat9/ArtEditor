package vn.tapbi.arteditor.data.local.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\n\u001a\u00020\u000bH\'J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\r\u001a\u00020\u000bH\'J\u001f\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0015H\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lvn/tapbi/arteditor/data/local/db/UnSplashDao;", "", "getAllPhotos", "Landroidx/lifecycle/LiveData;", "", "Lvn/tapbi/arteditor/data/model/UnsplashPhotoModel;", "getLikedPhotos", "getPhotosByCategory", "Landroidx/paging/PagingSource;", "", "category", "", "getPhotosByTopic", "topicName", "insertAll", "", "photos", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updatePhotoLike", "photoId", "like", "", "app_devDebug"})
public abstract interface UnSplashDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertAll(@org.jetbrains.annotations.NotNull
    java.util.List<vn.tapbi.arteditor.data.model.UnsplashPhotoModel> photos, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM photo")
    public abstract androidx.lifecycle.LiveData<java.util.List<vn.tapbi.arteditor.data.model.UnsplashPhotoModel>> getAllPhotos();
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM photo WHERE nameTopic = :topicName")
    public abstract androidx.lifecycle.LiveData<java.util.List<vn.tapbi.arteditor.data.model.UnsplashPhotoModel>> getPhotosByTopic(@org.jetbrains.annotations.NotNull
    java.lang.String topicName);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM photo WHERE nameTopic = :category")
    public abstract androidx.paging.PagingSource<java.lang.Integer, vn.tapbi.arteditor.data.model.UnsplashPhotoModel> getPhotosByCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM photo WHERE `like` = 1")
    public abstract androidx.lifecycle.LiveData<java.util.List<vn.tapbi.arteditor.data.model.UnsplashPhotoModel>> getLikedPhotos();
    
    @androidx.room.Query(value = "UPDATE photo SET `like` = :like WHERE photoId = :photoId")
    public abstract void updatePhotoLike(@org.jetbrains.annotations.NotNull
    java.lang.String photoId, boolean like);
}