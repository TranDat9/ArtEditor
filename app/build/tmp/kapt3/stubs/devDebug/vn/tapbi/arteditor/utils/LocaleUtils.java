package vn.tapbi.arteditor.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000bJ\u0016\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0016\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000bJ\u0018\u0010\"\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\nH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0015\u0010\t\u001a\u00020\n*\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006$"}, d2 = {"Lvn/tapbi/arteditor/utils/LocaleUtils;", "", "()V", "codeLanguageCurrent", "", "getCodeLanguageCurrent", "()Ljava/lang/String;", "setCodeLanguageCurrent", "(Ljava/lang/String;)V", "preferredLocale", "Ljava/util/Locale;", "Landroid/content/Context;", "getPreferredLocale", "(Landroid/content/Context;)Ljava/util/Locale;", "applyLocalInFirst", "", "activity", "Landroid/app/Activity;", "localeString", "applyLocale", "context", "applyLocaleAndRestart", "getLanguages", "", "Lvn/tapbi/arteditor/common/models/Language;", "getLocaleCompat", "resources", "Landroid/content/res/Resources;", "isAtLeastSdkVersion", "", "versionCode", "", "setLocal", "local", "updateResource", "locale", "app_devDebug"})
public final class LocaleUtils {
    @org.jetbrains.annotations.NotNull
    public static final vn.tapbi.arteditor.utils.LocaleUtils INSTANCE = null;
    @org.jetbrains.annotations.Nullable
    private static java.lang.String codeLanguageCurrent = "en";
    
    private LocaleUtils() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCodeLanguageCurrent() {
        return null;
    }
    
    public final void setCodeLanguageCurrent(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    public final void applyLocale(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final android.content.Context setLocal(@org.jetbrains.annotations.NotNull
    java.lang.String local, @org.jetbrains.annotations.NotNull
    android.content.Context activity) {
        return null;
    }
    
    private final void updateResource(android.content.Context context, java.util.Locale locale) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Locale getLocaleCompat(@org.jetbrains.annotations.NotNull
    android.content.res.Resources resources) {
        return null;
    }
    
    public final boolean isAtLeastSdkVersion(int versionCode) {
        return false;
    }
    
    public final void applyLocaleAndRestart(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.NotNull
    java.lang.String localeString) {
    }
    
    public final void applyLocalInFirst(@org.jetbrains.annotations.NotNull
    android.app.Activity activity, @org.jetbrains.annotations.Nullable
    java.lang.String localeString) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<vn.tapbi.arteditor.common.models.Language> getLanguages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Locale getPreferredLocale(@org.jetbrains.annotations.NotNull
    android.content.Context $this$preferredLocale) {
        return null;
    }
}