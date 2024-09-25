package vn.tapbi.arteditor.data.model

import com.google.gson.annotations.SerializedName

data class PhotoResponse(
    @SerializedName("total")
    val total: Int,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("results")
    val results: List<UnsplashPhotoModel>
)