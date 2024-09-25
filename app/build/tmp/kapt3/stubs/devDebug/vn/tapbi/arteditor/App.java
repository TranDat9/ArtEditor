package vn.tapbi.arteditor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lvn/tapbi/arteditor/App;", "Landroidx/multidex/MultiDexApplication;", "()V", "mPrefHelper", "Lvn/tapbi/arteditor/data/local/SharedPreferenceHelper;", "getMPrefHelper", "()Lvn/tapbi/arteditor/data/local/SharedPreferenceHelper;", "setMPrefHelper", "(Lvn/tapbi/arteditor/data/local/SharedPreferenceHelper;)V", "initLog", "", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreate", "Companion", "app_devDebug"})
@dagger.hilt.android.HiltAndroidApp
public final class App extends androidx.multidex.MultiDexApplication {
    @javax.inject.Inject
    public vn.tapbi.arteditor.data.local.SharedPreferenceHelper mPrefHelper;
    @org.jetbrains.annotations.NotNull
    public static final vn.tapbi.arteditor.App.Companion Companion = null;
    private static vn.tapbi.arteditor.App instance;
    
    public App() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.tapbi.arteditor.data.local.SharedPreferenceHelper getMPrefHelper() {
        return null;
    }
    
    public final void setMPrefHelper(@org.jetbrains.annotations.NotNull
    vn.tapbi.arteditor.data.local.SharedPreferenceHelper p0) {
    }
    
    @java.lang.Override
    public void onCreate() {
    }
    
    private final void initLog() {
    }
    
    @java.lang.Override
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull
    android.content.res.Configuration newConfig) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lvn/tapbi/arteditor/App$Companion;", "", "()V", "<set-?>", "Lvn/tapbi/arteditor/App;", "instance", "getInstance", "()Lvn/tapbi/arteditor/App;", "setInstance", "(Lvn/tapbi/arteditor/App;)V", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final vn.tapbi.arteditor.App getInstance() {
            return null;
        }
        
        private final void setInstance(vn.tapbi.arteditor.App p0) {
        }
    }
}