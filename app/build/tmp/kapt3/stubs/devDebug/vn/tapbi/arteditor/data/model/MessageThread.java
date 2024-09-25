package vn.tapbi.arteditor.data.model;

import java.lang.System;

@androidx.room.Entity(tableName = "thread_message")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B?\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\u000bB\u0007\b\u0016\u00a2\u0006\u0002\u0010\fJ\u0013\u00100\u001a\u00020\u001e2\b\u00101\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00102\u001a\u00020\u0016H\u0016R\u001e\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010\"\u001a\u00020\u001e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u0010\u0010$\u001a\u00020\u001e8\u0002X\u0083D\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010\u0010R\u001e\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000e\"\u0004\b(\u0010\u0010R\u001e\u0010)\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0018\"\u0004\b+\u0010\u001aR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0012\"\u0004\b-\u0010\u0014R\u001e\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010\u00a8\u00063"}, d2 = {"Lvn/tapbi/arteditor/data/model/MessageThread;", "", "threadId", "", "id", "date", "name", "", "body", "uriPhoto", "numberPhone", "(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()V", "getBody", "()Ljava/lang/String;", "setBody", "(Ljava/lang/String;)V", "getDate", "()J", "setDate", "(J)V", "hasAttach", "", "getHasAttach", "()I", "setHasAttach", "(I)V", "getId", "setId", "isDelete", "", "()Z", "setDelete", "(Z)V", "isNotification", "setNotification", "isSelected", "getName", "setName", "getNumberPhone", "setNumberPhone", "read", "getRead", "setRead", "getThreadId", "setThreadId", "getUriPhoto", "setUriPhoto", "equals", "o", "hashCode", "app_devDebug"})
public final class MessageThread {
    @androidx.room.ColumnInfo(name = "threadId")
    @androidx.room.PrimaryKey
    private long threadId = 0L;
    @androidx.room.ColumnInfo(name = "id")
    private long id = 0L;
    @androidx.room.ColumnInfo(name = "date")
    private long date = 0L;
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "name", defaultValue = "")
    private java.lang.String name = "";
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "body", defaultValue = "")
    private java.lang.String body = "";
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "uriPhoto", defaultValue = "")
    private java.lang.String uriPhoto = "";
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "numberPhone", defaultValue = "")
    private java.lang.String numberPhone = "";
    @androidx.room.ColumnInfo(name = "read")
    private int read = 0;
    @androidx.room.ColumnInfo(name = "hasAttach")
    private int hasAttach = 0;
    @androidx.room.ColumnInfo(name = "isDelete")
    private boolean isDelete = false;
    @androidx.room.ColumnInfo(name = "isNotification")
    private boolean isNotification = false;
    @androidx.room.Ignore
    private final boolean isSelected = false;
    
    public final long getThreadId() {
        return 0L;
    }
    
    public final void setThreadId(long p0) {
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    public final long getDate() {
        return 0L;
    }
    
    public final void setDate(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getBody() {
        return null;
    }
    
    public final void setBody(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUriPhoto() {
        return null;
    }
    
    public final void setUriPhoto(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getNumberPhone() {
        return null;
    }
    
    public final void setNumberPhone(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final int getRead() {
        return 0;
    }
    
    public final void setRead(int p0) {
    }
    
    public final int getHasAttach() {
        return 0;
    }
    
    public final void setHasAttach(int p0) {
    }
    
    public final boolean isDelete() {
        return false;
    }
    
    public final void setDelete(boolean p0) {
    }
    
    public final boolean isNotification() {
        return false;
    }
    
    public final void setNotification(boolean p0) {
    }
    
    public MessageThread(long threadId, long id, long date, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String body, @org.jetbrains.annotations.NotNull
    java.lang.String uriPhoto, @org.jetbrains.annotations.NotNull
    java.lang.String numberPhone) {
        super();
    }
    
    public MessageThread() {
        super();
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object o) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
}