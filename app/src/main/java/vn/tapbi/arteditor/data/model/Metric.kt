package vn.tapbi.arteditor.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Metric {
    @SerializedName("Value")
    @Expose
    var value: Double? = null

    @SerializedName("Unit")
    @Expose
    var unit: String? = null

    @SerializedName("UnitType")
    @Expose
    var unitType: Int? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param unitType
     * @param unit
     * @param value
     */
    constructor(value: Double?, unit: String?, unitType: Int?) : super() {
        this.value = value
        this.unit = unit
        this.unitType = unitType
    }
}
