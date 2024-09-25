package vn.tapbi.arteditor.data.local.db

import androidx.lifecycle.LiveData
import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import vn.tapbi.arteditor.data.model.UnsplashPhotoModel


@Dao
interface UnSplashDao  {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(photos: List<UnsplashPhotoModel>)

    @Query("SELECT * FROM photo")
    fun getAllPhotos(): LiveData<List<UnsplashPhotoModel>>


    @Query("SELECT * FROM photo WHERE nameTopic = :topicName")
    fun getPhotosByTopic(topicName: String): LiveData<List<UnsplashPhotoModel>>

    @Query("SELECT * FROM photo WHERE nameTopic = :category")
    fun getPhotosByCategory(category: String): PagingSource<Int, UnsplashPhotoModel>

    @Query("UPDATE photo SET `like` = :like WHERE photoId = :photoId")
     fun updatePhotoLike(photoId: String, like: Boolean)

}
