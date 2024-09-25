package vn.tapbi.arteditor.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0007R \u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR \u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lvn/tapbi/arteditor/data/model/Country;", "", "()V", "iD", "", "localizedName", "englishName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEnglishName", "()Ljava/lang/String;", "setEnglishName", "(Ljava/lang/String;)V", "getID", "setID", "getLocalizedName", "setLocalizedName", "app_devDebug"})
public final class Country {
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "ID")
    private java.lang.String iD;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "LocalizedName")
    private java.lang.String localizedName;
    @org.jetbrains.annotations.Nullable
    @com.google.gson.annotations.Expose
    @com.google.gson.annotations.SerializedName(value = "EnglishName")
    private java.lang.String englishName;
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getID() {
        return null;
    }
    
    public final void setID(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getLocalizedName() {
        return null;
    }
    
    public final void setLocalizedName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEnglishName() {
        return null;
    }
    
    public final void setEnglishName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    /**
     * No args constructor for use in serialization
     */
    public Country() {
        super();
    }
    
    /**
     * @param englishName
     * @param localizedName
     * @param iD
     */
    public Country(@org.jetbrains.annotations.Nullable
    java.lang.String iD, @org.jetbrains.annotations.Nullable
    java.lang.String localizedName, @org.jetbrains.annotations.Nullable
    java.lang.String englishName) {
        super();
    }
}