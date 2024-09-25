package vn.tapbi.arteditor.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 <2\u00020\u0001:\u0001<B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B\u000f\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u00107\u001a\u00020)H\u0016J\u0018\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020)H\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u000bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\t\"\u0004\b!\u0010\u000bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\t\"\u0004\b$\u0010\u000bR\u001c\u0010%\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\t\"\u0004\b\'\u0010\u000bR\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0012\"\u0004\b0\u0010\u0014R\u001a\u00101\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R\u001a\u00104\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u0010+\"\u0004\b6\u0010-\u00a8\u0006="}, d2 = {"Lvn/tapbi/arteditor/data/model/ItemMessage;", "Landroid/os/Parcelable;", "()V", "in", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "body", "", "getBody", "()Ljava/lang/String;", "setBody", "(Ljava/lang/String;)V", "dataMMS", "getDataMMS", "setDataMMS", "date", "", "getDate", "()J", "setDate", "(J)V", "id", "getId", "setId", "isImage", "", "()Z", "setImage", "(Z)V", "isLike", "setLike", "linkMMS", "getLinkMMS", "setLinkMMS", "receiver", "getReceiver", "setReceiver", "sender", "getSender", "setSender", "subId", "", "getSubId", "()I", "setSubId", "(I)V", "threadId", "getThreadId", "setThreadId", "type", "getType", "setType", "typeMMS", "getTypeMMS", "setTypeMMS", "describeContents", "writeToParcel", "", "dest", "flags", "CREATOR", "app_devDebug"})
public class ItemMessage implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    private java.lang.String body;
    @org.jetbrains.annotations.Nullable
    private java.lang.String isLike;
    private long date = 0L;
    private long id = 0L;
    private long threadId = 0L;
    private int type = 0;
    private int subId = 0;
    @org.jetbrains.annotations.Nullable
    private java.lang.String dataMMS;
    private int typeMMS = 0;
    @org.jetbrains.annotations.Nullable
    private java.lang.String sender;
    @org.jetbrains.annotations.Nullable
    private java.lang.String receiver;
    @org.jetbrains.annotations.Nullable
    private java.lang.String linkMMS;
    private boolean isImage = false;
    @org.jetbrains.annotations.NotNull
    public static final vn.tapbi.arteditor.data.model.ItemMessage.CREATOR CREATOR = null;
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getBody() {
        return null;
    }
    
    public final void setBody(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String isLike() {
        return null;
    }
    
    public final void setLike(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final long getDate() {
        return 0L;
    }
    
    public final void setDate(long p0) {
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    public final long getThreadId() {
        return 0L;
    }
    
    public final void setThreadId(long p0) {
    }
    
    public final int getType() {
        return 0;
    }
    
    public final void setType(int p0) {
    }
    
    public final int getSubId() {
        return 0;
    }
    
    public final void setSubId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDataMMS() {
        return null;
    }
    
    public final void setDataMMS(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final int getTypeMMS() {
        return 0;
    }
    
    public final void setTypeMMS(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSender() {
        return null;
    }
    
    public final void setSender(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getReceiver() {
        return null;
    }
    
    public final void setReceiver(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLinkMMS() {
        return null;
    }
    
    public final void setLinkMMS(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final boolean isImage() {
        return false;
    }
    
    public final void setImage(boolean p0) {
    }
    
    public ItemMessage() {
        super();
    }
    
    protected ItemMessage(@org.jetbrains.annotations.NotNull
    android.os.Parcel in) {
        super();
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel dest, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lvn/tapbi/arteditor/data/model/ItemMessage$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lvn/tapbi/arteditor/data/model/ItemMessage;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lvn/tapbi/arteditor/data/model/ItemMessage;", "app_devDebug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<vn.tapbi.arteditor.data.model.ItemMessage> {
        
        private CREATOR() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public vn.tapbi.arteditor.data.model.ItemMessage createFromParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public vn.tapbi.arteditor.data.model.ItemMessage[] newArray(int size) {
            return null;
        }
    }
}