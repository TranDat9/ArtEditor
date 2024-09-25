package vn.tapbi.arteditor.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Location {
    @SerializedName("Version")
    @Expose
    var version: Int? = null

    @SerializedName("Key")
    @Expose
    var key: String? = null

    @SerializedName("Type")
    @Expose
    var type: String? = null

    @SerializedName("Rank")
    @Expose
    var rank: Int? = null

    @SerializedName("LocalizedName")
    @Expose
    var localizedName: String? = null

    @SerializedName("EnglishName")
    @Expose
    var englishName: String? = null

    @SerializedName("PrimaryPostalCode")
    @Expose
    var primaryPostalCode: String? = null

    @SerializedName("Country")
    @Expose
    var country: Country? = null

    constructor() {}
    constructor(
        version: Int?,
        key: String?,
        type: String?,
        rank: Int?,
        localizedName: String?,
        englishName: String?,
        primaryPostalCode: String?,
        country: Country?
    ) : super() {
        this.version = version
        this.key = key
        this.type = type
        this.rank = rank
        this.localizedName = localizedName
        this.englishName = englishName
        this.primaryPostalCode = primaryPostalCode
        this.country = country
    }
}
