package vn.tapbi.arteditor.data.local.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u001a\u0010\u000f\u001a\u00020\f2\u0010\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\bH\'R\u001e\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001e\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\b8gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lvn/tapbi/arteditor/data/local/db/MessageThreadDao;", "", "allThreadMessage", "Landroidx/lifecycle/LiveData;", "Lvn/tapbi/arteditor/data/model/MessageThread;", "getAllThreadMessage", "()Landroidx/lifecycle/LiveData;", "allThreadMessages", "", "getAllThreadMessages", "()Ljava/util/List;", "deleteById", "", "id", "", "insertThreadsMessage", "messageThreadList", "app_devDebug"})
public abstract interface MessageThreadDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM thread_message")
    public abstract androidx.lifecycle.LiveData<vn.tapbi.arteditor.data.model.MessageThread> getAllThreadMessage();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM thread_message")
    public abstract java.util.List<vn.tapbi.arteditor.data.model.MessageThread> getAllThreadMessages();
    
    @androidx.room.Insert(onConflict = 1)
    public abstract void insertThreadsMessage(@org.jetbrains.annotations.Nullable
    java.util.List<vn.tapbi.arteditor.data.model.MessageThread> messageThreadList);
    
    @androidx.room.Query(value = "DELETE FROM thread_message WHERE threadId = :id")
    public abstract void deleteById(int id);
}