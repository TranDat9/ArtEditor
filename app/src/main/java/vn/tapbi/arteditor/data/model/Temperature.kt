package vn.tapbi.arteditor.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Temperature {
    @SerializedName("Metric")
    @Expose
    var metric: Metric? = null
}