package vn.tapbi.arteditor.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Country {
    @SerializedName("ID")
    @Expose
    var iD: String? = null

    @SerializedName("LocalizedName")
    @Expose
    var localizedName: String? = null

    @SerializedName("EnglishName")
    @Expose
    var englishName: String? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param englishName
     * @param localizedName
     * @param iD
     */
    constructor(iD: String?, localizedName: String?, englishName: String?) : super() {
        this.iD = iD
        this.localizedName = localizedName
        this.englishName = englishName
    }
}