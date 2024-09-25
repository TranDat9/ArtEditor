package vn.tapbi.arteditor.data.remote

import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query
import vn.tapbi.arteditor.data.model.Location
import vn.tapbi.arteditor.data.model.PhotoResponse
import vn.tapbi.arteditor.data.model.UnsplashPhotoModel
import vn.tapbi.arteditor.data.model.Weather

interface UnsplashApi {

//    @GET("/photos")
//    suspend fun getPhotos(
//        @Query("client_id") clientId: String?,
//        @Query("query") category: String?
//    ): List<UnsplashPhotoModel>

    @GET("/search/photos")
    suspend fun getPhotos(
        @Query("client_id") clientId: String?,
        @Query("query") category: String?
    ): PhotoResponse

}