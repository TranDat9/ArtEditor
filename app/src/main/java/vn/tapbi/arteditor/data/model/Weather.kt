package vn.tapbi.arteditor.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Weather {
    @SerializedName("LocalObservationDateTime")
    @Expose
    var localObservationDateTime: String? = null

    @SerializedName("EpochTime")
    @Expose
    var epochTime: Int? = null

    @SerializedName("WeatherText")
    @Expose
    var weatherText: String? = null

    @SerializedName("WeatherIcon")
    @Expose
    var weatherIcon: Int? = null

    @SerializedName("HasPrecipitation")
    @Expose
    var hasPrecipitation: Boolean? = null

    @SerializedName("PrecipitationType")
    @Expose
    var precipitationType: Any? = null

    @SerializedName("IsDayTime")
    @Expose
    var isDayTime: Boolean? = null

    @SerializedName("Temperature")
    @Expose
    var temperature: Temperature? = null

    @SerializedName("MobileLink")
    @Expose
    var mobileLink: String? = null

    @SerializedName("Link")
    @Expose
    var link: String? = null

    /**
     * No args constructor for use in serialization
     *
     */
    constructor() {}

    /**
     *
     * @param hasPrecipitation
     * @param weatherIcon
     * @param precipitationType
     * @param localObservationDateTime
     * @param isDayTime
     * @param temperature
     * @param link
     * @param mobileLink
     * @param epochTime
     * @param weatherText
     */
    constructor(
        localObservationDateTime: String?,
        epochTime: Int?,
        weatherText: String?,
        weatherIcon: Int?,
        hasPrecipitation: Boolean?,
        precipitationType: Any?,
        isDayTime: Boolean?,
        temperature: Temperature?,
        mobileLink: String?,
        link: String?
    ) : super() {
        this.localObservationDateTime = localObservationDateTime
        this.epochTime = epochTime
        this.weatherText = weatherText
        this.weatherIcon = weatherIcon
        this.hasPrecipitation = hasPrecipitation
        this.precipitationType = precipitationType
        this.isDayTime = isDayTime
        this.temperature = temperature
        this.mobileLink = mobileLink
        this.link = link
    }
}
