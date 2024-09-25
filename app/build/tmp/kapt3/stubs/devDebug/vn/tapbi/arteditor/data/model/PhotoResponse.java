package vn.tapbi.arteditor.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0018"}, d2 = {"Lvn/tapbi/arteditor/data/model/PhotoResponse;", "", "total", "", "totalPages", "results", "", "Lvn/tapbi/arteditor/data/model/UnsplashPhotoModel;", "(IILjava/util/List;)V", "getResults", "()Ljava/util/List;", "getTotal", "()I", "getTotalPages", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_devDebug"})
public final class PhotoResponse {
    @com.google.gson.annotations.SerializedName(value = "total")
    private final int total = 0;
    @com.google.gson.annotations.SerializedName(value = "total_pages")
    private final int totalPages = 0;
    @org.jetbrains.annotations.NotNull
    @com.google.gson.annotations.SerializedName(value = "results")
    private final java.util.List<vn.tapbi.arteditor.data.model.UnsplashPhotoModel> results = null;
    
    @org.jetbrains.annotations.NotNull
    public final vn.tapbi.arteditor.data.model.PhotoResponse copy(int total, int totalPages, @org.jetbrains.annotations.NotNull
    java.util.List<vn.tapbi.arteditor.data.model.UnsplashPhotoModel> results) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public PhotoResponse(int total, int totalPages, @org.jetbrains.annotations.NotNull
    java.util.List<vn.tapbi.arteditor.data.model.UnsplashPhotoModel> results) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getTotal() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getTotalPages() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<vn.tapbi.arteditor.data.model.UnsplashPhotoModel> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<vn.tapbi.arteditor.data.model.UnsplashPhotoModel> getResults() {
        return null;
    }
}