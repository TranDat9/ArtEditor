package vn.tapbi.arteditor.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.google.gson.Gson
import kotlinx.coroutines.flow.Flow
import timber.log.Timber
import vn.tapbi.arteditor.common.Constant
import vn.tapbi.arteditor.data.local.db.TapbiDb
import vn.tapbi.arteditor.data.local.db.UnSplashDao
import vn.tapbi.arteditor.data.model.UnsplashPhotoModel
import vn.tapbi.arteditor.data.remote.UnsplashApi
import javax.inject.Inject

class UnSplashPhotoRepository @Inject constructor(
    private val unsplashApi: UnsplashApi,
    val tapbiDb: TapbiDb
) {
    fun getAllPhotos(): LiveData<List<UnsplashPhotoModel>> {
        return tapbiDb.unSplashDao.getAllPhotos()
    }

    fun getPhotosByCategory(category: String): Flow<PagingData<UnsplashPhotoModel>> {
        return Pager(
            config = PagingConfig(
                pageSize = 20,
                enablePlaceholders = false
            ),
            pagingSourceFactory = { tapbiDb.unSplashDao.getPhotosByCategory(category) }
        ).flow
    }

    fun getLikedPhotos(): LiveData<List<UnsplashPhotoModel>> {
        return tapbiDb.unSplashDao.getLikedPhotos()
    }

    suspend fun refreshPhotos(clientId: String, category: String) {
        try {
            Log.d("API Request", "Fetching photos with client_id: $clientId and category: $category")
            val photoResponse = unsplashApi.getPhotos(clientId, category)
            Log.d("API Response", Gson().toJson(photoResponse))

            // Check if photoResponse is null or empty
            if (photoResponse == null) {
                Log.d("API Response", "photoResponse is null")
                return
            }

            val newPhotos = photoResponse.results
            if (newPhotos.isNullOrEmpty()) {
                Log.d("API Response Results", "No photos received or list is empty")
                return
            }

            Log.d("API Response Results", "Number of photos received: ${newPhotos.size}")

            // Convert and insert into Room
            val photoEntities = newPhotos.map { apiPhoto ->
                UnsplashPhotoModel(
                    id = apiPhoto.id,
                    urls = apiPhoto.urls,
                    links = apiPhoto.links,
                    nameTopic = category,
                    like = false
                )
            }
            tapbiDb.unSplashDao.insertAll(photoEntities)
            Log.d("Database Insertion", "Inserted ${photoEntities.size} photos into the database")
        } catch (e: Exception) {
            Timber.e(e, "Error fetching photos")
        }
    }





}
