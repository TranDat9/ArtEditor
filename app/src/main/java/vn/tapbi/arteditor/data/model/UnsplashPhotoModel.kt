package vn.tapbi.arteditor.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "photo")
class UnsplashPhotoModel {
    @PrimaryKey
    @SerializedName("id")
    @ColumnInfo(name = "photoId")
    @Expose
    var id: String = ""

    @SerializedName("urls")
    @Ignore
    @Expose
    var urls: Url? = null

    @SerializedName("links")
    @Ignore
    @Expose
    var links: Link? = null

    @ColumnInfo(name = "nameTopic")
    var nameTopic: String? = ""

    @ColumnInfo(name = "photoLink")
    var linksParse: String? = ""

    @ColumnInfo(name = "photoUrl")
    var urlsParse: String? = ""

    @ColumnInfo(name = "like")
    var like: Boolean = false

    constructor() {}

    constructor(
        id: String,
        urls: Url?,
        links: Link?,
        nameTopic: String?,
        like: Boolean
    ) {
        this.id = id
        this.urlsParse = urls?.regular
        this.linksParse = links?.download
        this.nameTopic = nameTopic
        this.like = like
    }
}

data class Url(
    @SerializedName("raw")
    val raw: String?,
    @SerializedName("full")
    val full: String?,
    @SerializedName("regular")
    val regular: String?,
    @SerializedName("small")
    val small: String?,
    @SerializedName("thumb")
    val thumb: String?,
    @SerializedName("small_s3")
    val smallS3: String?
)

data class Link(
    @SerializedName("self")
    val self: String?,
    @SerializedName("html")
    val html: String?,
    @SerializedName("download")
    val download: String?,
    @SerializedName("download_location")
    val downloadLocation: String?
)