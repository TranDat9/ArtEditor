package vn.tapbi.arteditor.data.model

import android.os.Parcel
import android.os.Parcelable


open class ItemMessage : Parcelable {
    var body: String? = null
    var isLike: String? = null
    var date: Long = 0
    var id: Long = 0
    var threadId: Long = 0
    var type = 0
    var subId = 0
    var dataMMS: String? = null
    var typeMMS = 0
    var sender: String? = null
    var receiver: String? = null
    var linkMMS: String? = null
    var isImage = false

    constructor() {}
    protected constructor(`in`: Parcel) {
        body = `in`.readString()
        date = `in`.readLong()
        id = `in`.readLong()
        threadId = `in`.readLong()
        type = `in`.readInt()
        dataMMS = `in`.readString()
        typeMMS = `in`.readInt()
        sender = `in`.readString()
        receiver = `in`.readString()
        linkMMS = `in`.readString()
        isImage = `in`.readByte().toInt() != 0
        isLike = `in`.readString()
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(body)
        dest.writeLong(date)
        dest.writeLong(id)
        dest.writeLong(threadId)
        dest.writeInt(type)
        dest.writeString(dataMMS)
        dest.writeInt(typeMMS)
        dest.writeString(sender)
        dest.writeString(receiver)
        dest.writeString(linkMMS)
        dest.writeByte((if (isImage) 1 else 0).toByte())
        dest.writeString(isLike)
    }

    companion object CREATOR : Parcelable.Creator<ItemMessage> {
        override fun createFromParcel(parcel: Parcel): ItemMessage {
            return ItemMessage(parcel)
        }

        override fun newArray(size: Int): Array<ItemMessage?> {
            return arrayOfNulls(size)
        }
    }

}