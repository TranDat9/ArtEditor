package vn.tapbi.arteditor.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J(\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0012\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lvn/tapbi/arteditor/ui/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "mPrefHelper", "Lvn/tapbi/arteditor/data/local/SharedPreferenceHelper;", "getMPrefHelper", "()Lvn/tapbi/arteditor/data/local/SharedPreferenceHelper;", "setMPrefHelper", "(Lvn/tapbi/arteditor/data/local/SharedPreferenceHelper;)V", "statusBarHeight", "", "getStatusBarHeight", "()I", "setStatusBarHeight", "(I)V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "changeSystemUIColor", "colorStatusBar", "colorNavigationBar", "darkStatusBar", "", "darkNavigation", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_devDebug"})
@dagger.hilt.android.AndroidEntryPoint
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject
    public vn.tapbi.arteditor.data.local.SharedPreferenceHelper mPrefHelper;
    private int statusBarHeight = 0;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.tapbi.arteditor.data.local.SharedPreferenceHelper getMPrefHelper() {
        return null;
    }
    
    public final void setMPrefHelper(@org.jetbrains.annotations.NotNull
    vn.tapbi.arteditor.data.local.SharedPreferenceHelper p0) {
    }
    
    public final int getStatusBarHeight() {
        return 0;
    }
    
    public final void setStatusBarHeight(int p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull
    android.content.Context newBase) {
    }
    
    public void changeSystemUIColor(int colorStatusBar, int colorNavigationBar, boolean darkStatusBar, boolean darkNavigation) {
    }
}