package vn.tapbi.arteditor.data.model;

import java.lang.System;

@androidx.room.Entity(tableName = "categories")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B-\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\tR\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\b\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0010\"\u0004\b\u001a\u0010\u0012R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0010\"\u0004\b\u001c\u0010\u0012R \u0010\u0007\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\"\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012\u00a8\u0006%"}, d2 = {"Lvn/tapbi/arteditor/data/model/CategoryModel;", "", "()V", "catId", "", "nameCategory", "", "urls", "links", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCatId", "()J", "setCatId", "(J)V", "id", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Lvn/tapbi/arteditor/data/model/Link;", "getLinks", "()Lvn/tapbi/arteditor/data/model/Link;", "setLinks", "(Lvn/tapbi/arteditor/data/model/Link;)V", "linksParse", "getLinksParse", "setLinksParse", "getNameCategory", "setNameCategory", "Lvn/tapbi/arteditor/data/model/Url;", "getUrls", "()Lvn/tapbi/arteditor/data/model/Url;", "setUrls", "(Lvn/tapbi/arteditor/data/model/Url;)V", "urlsParse", "getUrlsParse", "setUrlsParse", "app_devDebug"})
public final class CategoryModel {
    @androidx.room.ColumnInfo(name = "catId")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long catId = 0L;
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "nameCategory")
    private java.lang.String nameCategory = "";
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "photoId")
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
    @androidx.room.ColumnInfo(name = "photoLink")
    private java.lang.String linksParse = "";
    @org.jetbrains.annotations.Nullable
    @androidx.room.ColumnInfo(name = "photoUrl")
    private java.lang.String urlsParse = "";
    
    public final long getCatId() {
        return 0L;
    }
    
    public final void setCatId(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNameCategory() {
        return null;
    }
    
    public final void setNameCategory(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable
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
    
    public CategoryModel() {
        super();
    }
    
    public CategoryModel(long catId, @org.jetbrains.annotations.Nullable
    java.lang.String nameCategory, @org.jetbrains.annotations.Nullable
    java.lang.String urls, @org.jetbrains.annotations.Nullable
    java.lang.String links) {
        super();
    }
}