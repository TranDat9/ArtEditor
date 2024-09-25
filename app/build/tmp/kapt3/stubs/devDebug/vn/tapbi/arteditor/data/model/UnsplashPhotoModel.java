package vn.tapbi.arteditor.data.model;

import java.lang.System;

@androidx.room.Entity(tableName = "photo")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B5\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000e\"\u0004\b\u001d\u0010\u0010R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\"\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000e\"\u0004\b$\u0010\u0010\u00a8\u0006%"}, d2 = {"Lvn/tapbi/arteditor/data/model/UnsplashPhotoModel;", "", "()V", "id", "", "urls", "Lvn/tapbi/arteditor/data/model/Url;", "links", "Lvn/tapbi/arteditor/data/model/Link;", "nameTopic", "like", "", "(Ljava/lang/String;Lvn/tapbi/arteditor/data/model/Url;Lvn/tapbi/arteditor/data/model/Link;Ljava/lang/String;Z)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getLike", "()Z", "setLike", "(Z)V", "getLinks", "()Lvn/tapbi/arteditor/data/model/Link;", "setLinks", "(Lvn/tapbi/arteditor/data/model/Link;)V", "linksParse", "getLinksParse", "setLinksParse", "getNameTopic", "setNameTopic", "getUrls", "()Lvn/tapbi/arteditor/data/model/Url;", "setUrls", "(Lvn/tapbi/arteditor/data/model/Url;)V", "urlsParse", "getUrlsParse", "setUrlsParse", "app_devDebug"})
public final class UnsplashPhotoModel {
    @org.jetbrains.annotations.NotNull
    @androidx.room.ColumnInfo(name = "photoId")
    @androidx.room.PrimaryKey
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "id")
    private java.lang.String id = "";
    @org.jetbrains.annotations.Nullable
    @androidx.room.Ignore
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "urls")
    private vn.tapbi.arteditor.data.model.Url urls;
    @org.jetbrains.annotations.Nullable
    @androidx.room.Ignore
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "links")
    private vn.tapbi.arteditor.data.model.Link links;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "nameTopic")
    private java.lang.String nameTopic = "";
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "photoLink")
    private java.lang.String linksParse = "";
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "photoUrl")
    private java.lang.String urlsParse = "";
    @androidx.room.ColumnInfo(name = "like")
    private boolean like = false;
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final vn.tapbi.arteditor.data.model.Url getUrls() {
        return null;
    }
    
    public final void setUrls(@org.jetbrains.annotations.Nullable
    vn.tapbi.arteditor.data.model.Url p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final vn.tapbi.arteditor.data.model.Link getLinks() {
        return null;
    }
    
    public final void setLinks(@org.jetbrains.annotations.Nullable
    vn.tapbi.arteditor.data.model.Link p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNameTopic() {
        return null;
    }
    
    public final void setNameTopic(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLinksParse() {
        return null;
    }
    
    public final void setLinksParse(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUrlsParse() {
        return null;
    }
    
    public final void setUrlsParse(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final boolean getLike() {
        return false;
    }
    
    public final void setLike(boolean p0) {
    }
    
    public UnsplashPhotoModel() {
        super();
    }
    
    public UnsplashPhotoModel(@org.jetbrains.annotations.NotNull
    java.lang.String id, @org.jetbrains.annotations.Nullable
    vn.tapbi.arteditor.data.model.Url urls, @org.jetbrains.annotations.Nullable
    vn.tapbi.arteditor.data.model.Link links, @org.jetbrains.annotations.Nullable
    java.lang.String nameTopic, boolean like) {
        super();
    }
}