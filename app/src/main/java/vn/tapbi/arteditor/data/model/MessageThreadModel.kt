package vn.tapbi.arteditor.data.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import vn.tapbi.arteditor.common.Constant

@Entity(tableName = Constant.DB_SMS)
class MessageThreadModel {
    @PrimaryKey
    var threadId: Long = 0
    var id: Long = 0
    var date: Long = 0
    var name = ""
    var body = ""
    var uriPhoto = ""
    var numberPhone = ""
    var read = 0
    var hasAttach = 0
    var isDelete = false
    var isNotification = false


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is MessageThreadModel) return false
        return !(date != other.date || threadId != other.threadId || id != other.id || read != other.read || hasAttach != other.hasAttach || isDelete != other.isDelete || isNotification != other.isNotification || name != other.name || body != other.body || uriPhoto != other.uriPhoto || numberPhone != other.numberPhone)
    }

}