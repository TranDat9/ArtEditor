package vn.tapbi.arteditor.data.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\t\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\r\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000eJ\u0010\u0010\u0013\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0018\u0010\u0015\u001a\u00020\u00142\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u001c\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u0006\u0010\u001b\u001a\u00020\u001aJ \u0010\u001c\u001a\u00020\u001a2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0011J \u0010\u001e\u001a\u00020\u001a2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0011J\u0018\u0010\u001f\u001a\u00020\u001a2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\u0006J\u0018\u0010!\u001a\u00020\u001a2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\fJ\u0018\u0010\"\u001a\u00020\u001a2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\u000eJ\u0018\u0010#\u001a\u00020\u001a2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010 \u001a\u00020\u0014J\u001a\u0010$\u001a\u00020\u001a2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010 \u001a\u0004\u0018\u00010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lvn/tapbi/arteditor/data/local/SharedPreferenceHelper;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "containKey", "", "key", "", "getBoolean", "defaultValue", "getFloat", "", "getInt", "", "valueDefault", "getIntArray", "", "getIntWithDefault", "getLong", "", "getLongWithDefault", "getString", "getStringArrayPref", "getStringWithDefault", "removeKey", "", "resetAll", "setIntArray", "values", "setStringArrayPref", "storeBoolean", "value", "storeFloat", "storeInt", "storeLong", "storeString", "Companion", "app_devDebug"})
public final class SharedPreferenceHelper {
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull
    public static final vn.tapbi.arteditor.data.local.SharedPreferenceHelper.Companion Companion = null;
    private static final int DEFAULT_NUM = 0;
    private static final java.lang.String DEFAULT_STRING = "";
    
    @javax.inject.Inject
    public SharedPreferenceHelper(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    public final void storeString(@org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getString(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getStringWithDefault(@org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.Nullable
    java.lang.String defaultValue) {
        return null;
    }
    
    public final void storeInt(@org.jetbrains.annotations.Nullable
    java.lang.String key, int value) {
    }
    
    public final int getInt(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
        return 0;
    }
    
    public final int getInt(@org.jetbrains.annotations.Nullable
    java.lang.String key, int valueDefault) {
        return 0;
    }
    
    public final int getIntWithDefault(@org.jetbrains.annotations.Nullable
    java.lang.String key, int defaultValue) {
        return 0;
    }
    
    public final void storeLong(@org.jetbrains.annotations.Nullable
    java.lang.String key, long value) {
    }
    
    public final long getLong(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
        return 0L;
    }
    
    public final long getLongWithDefault(@org.jetbrains.annotations.Nullable
    java.lang.String key, long defaultValue) {
        return 0L;
    }
    
    public final void storeBoolean(@org.jetbrains.annotations.Nullable
    java.lang.String key, boolean value) {
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.Nullable
    java.lang.String key, boolean defaultValue) {
        return false;
    }
    
    public final void storeFloat(@org.jetbrains.annotations.Nullable
    java.lang.String key, float value) {
    }
    
    public final float getFloat(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
        return 0.0F;
    }
    
    public final void setStringArrayPref(@org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> values) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getStringArrayPref(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
        return null;
    }
    
    public final void setIntArray(@org.jetbrains.annotations.Nullable
    java.lang.String key, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.Integer> values) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Integer> getIntArray(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
        return null;
    }
    
    public final void removeKey(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
    }
    
    public final void resetAll() {
    }
    
    public final boolean containKey(@org.jetbrains.annotations.Nullable
    java.lang.String key) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lvn/tapbi/arteditor/data/local/SharedPreferenceHelper$Companion;", "", "()V", "DEFAULT_NUM", "", "DEFAULT_STRING", "", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}