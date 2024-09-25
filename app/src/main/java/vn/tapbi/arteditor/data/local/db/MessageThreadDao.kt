package vn.tapbi.arteditor.data.local.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import vn.tapbi.arteditor.data.model.MessageThread

@Dao
interface MessageThreadDao {

    @get:Query("SELECT * FROM thread_message")
    val allThreadMessage: LiveData<MessageThread?>?

    @get:Query("SELECT * FROM thread_message")
    val allThreadMessages: List<MessageThread?>?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertThreadsMessage(messageThreadList: List<MessageThread?>?)

    @Query("DELETE FROM thread_message WHERE threadId = :id")
    fun deleteById(id: Int)

}
