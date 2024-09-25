package vn.tapbi.arteditor.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


@Entity(tableName = "categories")
class CategoryModel {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "catId")
    var catId: Long = 0

    @ColumnInfo(name = "nameCategory")
    var nameCategory: String? = ""

    @SerializedName("id")
    @ColumnInfo(name = "photoId")
    @Expose
    var id: String? =""

    @SerializedName("urls")
    @Ignore
    @Expose
    var urls: Url? = null

    @SerializedName("links")
    @Ignore
    @Expose
    var links: Link? = null

    @ColumnInfo(name = "photoLink")
    var linksParse: String? = ""

    @ColumnInfo(name = "photoUrl")
    var urlsParse: String? = ""

    constructor() {}

    constructor(
        catId: Long,
        nameCategory: String?,
        urls: String?,
        links: String?,
    ) {
        this.catId = catId
        this.nameCategory = nameCategory
        this.urlsParse = urls
        this.linksParse = links
    }
}
