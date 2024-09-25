package vn.tapbi.arteditor.data.model;

import java.lang.System;

@androidx.room.Entity(tableName = "Sms.db")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010.\u001a\u00020\u00192\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001a\"\u0004\b\u001e\u0010\u001cR\u001a\u0010\u001f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001a\u0010\"\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0012\"\u0004\b\'\u0010\u0014R\u001e\u0010(\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR\u001a\u0010+\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0006\"\u0004\b-\u0010\b\u00a8\u00060"}, d2 = {"Lvn/tapbi/arteditor/data/model/MessageThreadModel;", "", "()V", "body", "", "getBody", "()Ljava/lang/String;", "setBody", "(Ljava/lang/String;)V", "date", "", "getDate", "()J", "setDate", "(J)V", "hasAttach", "", "getHasAttach", "()I", "setHasAttach", "(I)V", "id", "getId", "setId", "isDelete", "", "()Z", "setDelete", "(Z)V", "isNotification", "setNotification", "name", "getName", "setName", "numberPhone", "getNumberPhone", "setNumberPhone", "read", "getRead", "setRead", "threadId", "getThreadId", "setThreadId", "uriPhoto", "getUriPhoto", "setUriPhoto", "equals", "other", "app_devDebug"})
public final class MessageThreadModel {
    @androidx.room.PrimaryKey
    private long threadId = 0L;
    private long id = 0L;
    private long date = 0L;
    @org.jetbrains.annotations.NotNull
    private java.lang.String name = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String body = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String uriPhoto = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String numberPhone = "";
    private int read = 0;
    private int hasAttach = 0;
    private boolean isDelete = false;
    private boolean isNotification = false;
    
    public MessageThreadModel() {
        super();
    }
    
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
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
}