package vn.tapbi.arteditor.data.model

import androidx.room.ColumnInfo

import androidx.room.Entity

import androidx.room.Ignore

import androidx.room.PrimaryKey

import java.util.*


@Entity(tableName = "thread_message")
class MessageThread {
    @PrimaryKey
    @ColumnInfo(name = "threadId")
    var threadId: Long = 0

    @ColumnInfo(name = "id")
    var id: Long = 0

    @ColumnInfo(name = "date")
    var date: Long = 0

    @ColumnInfo(name = "name", defaultValue = "")
    var name = ""

    @ColumnInfo(name = "body", defaultValue = "")
    var body = ""

    @ColumnInfo(name = "uriPhoto", defaultValue = "")
    var uriPhoto = ""

    @ColumnInfo(name = "numberPhone", defaultValue = "")
    var numberPhone = ""

    @ColumnInfo(name = "read")
    var read = 0

    @ColumnInfo(name = "hasAttach")
    var hasAttach = 0

    @ColumnInfo(name = "isDelete")
    var isDelete = false

    @ColumnInfo(name = "isNotification")
    var isNotification = false

    @Ignore
    private val isSelected = false

    constructor(
        threadId: Long,
        id: Long,
        date: Long,
        name: String,
        body: String,
        uriPhoto: String,
        numberPhone: String
    ) {
        this.threadId = threadId
        this.id = id
        this.date = date
        this.name = name
        this.body = body
        this.uriPhoto = uriPhoto
        this.numberPhone = numberPhone
    }

    constructor() {}

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o !is MessageThread) return false
        return date == o.date && threadId == o.threadId && id == o.id && read == o.read && hasAttach == o.hasAttach && isDelete == o.isDelete && isNotification == o.isNotification &&
                name == o.name &&
                body == o.body &&
                uriPhoto == o.uriPhoto &&
                numberPhone == o.numberPhone
    }

    override fun hashCode(): Int {
        return Objects.hash(
            name,
            body,
            uriPhoto,
            numberPhone,
            date,
            threadId,
            id,
            read,
            hasAttach,
            isDelete,
            isNotification
        )
    }
}