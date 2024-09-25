package vn.tapbi.arteditor.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lvn/tapbi/arteditor/data/remote/UnsplashApi;", "", "getPhotos", "Lvn/tapbi/arteditor/data/model/PhotoResponse;", "clientId", "", "category", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_devDebug"})
public abstract interface UnsplashApi {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/search/photos")
    public abstract java.lang.Object getPhotos(@org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "client_id")
    java.lang.String clientId, @org.jetbrains.annotations.Nullable
    @retrofit2.http.Query(value = "query")
    java.lang.String category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super vn.tapbi.arteditor.data.model.PhotoResponse> continuation);
}