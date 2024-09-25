package vn.tapbi.arteditor.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010!\u001a\u00020\u0014H\u0004J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\"H$J\b\u0010#\u001a\u00020\u0014H\u0016J\b\u0010$\u001a\u00020\u0014H\u0016J\b\u0010%\u001a\u00020&H$J&\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001c\u0010/\u001a\u00020&2\b\u00100\u001a\u0004\u0018\u00010(2\b\u0010-\u001a\u0004\u0018\u00010.H$J\b\u00101\u001a\u00020&H$J\b\u00102\u001a\u00020&H\u0016J\u001a\u00103\u001a\u00020&2\u0006\u00100\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016R\u001c\u0010\u0007\u001a\u00028\u0000X\u0086.\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\u0010X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u00028\u0001X\u0086.\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u00064"}, d2 = {"Lvn/tapbi/arteditor/ui/base/BaseBindingFragment;", "B", "Landroidx/databinding/ViewDataBinding;", "T", "Lvn/tapbi/arteditor/ui/base/BaseViewModel;", "Lvn/tapbi/arteditor/ui/base/BaseFragment;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "lastClickTime", "", "layoutId", "", "getLayoutId", "()I", "loaded", "", "mainViewModel", "Lvn/tapbi/arteditor/ui/main/MainViewModel;", "getMainViewModel", "()Lvn/tapbi/arteditor/ui/main/MainViewModel;", "setMainViewModel", "(Lvn/tapbi/arteditor/ui/main/MainViewModel;)V", "viewModel", "getViewModel", "()Lvn/tapbi/arteditor/ui/base/BaseViewModel;", "setViewModel", "(Lvn/tapbi/arteditor/ui/base/BaseViewModel;)V", "Lvn/tapbi/arteditor/ui/base/BaseViewModel;", "checkTime", "Ljava/lang/Class;", "needInsetTop", "needToKeepView", "observerData", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onCreatedView", "view", "onPermissionGranted", "onStart", "onViewCreated", "app_devDebug"})
public abstract class BaseBindingFragment<B extends androidx.databinding.ViewDataBinding, T extends vn.tapbi.arteditor.ui.base.BaseViewModel> extends vn.tapbi.arteditor.ui.base.BaseFragment {
    public B binding;
    public T viewModel;
    public vn.tapbi.arteditor.ui.main.MainViewModel mainViewModel;
    private boolean loaded = false;
    private long lastClickTime = 0L;
    
    public BaseBindingFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final B getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull
    B p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final T getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull
    T p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final vn.tapbi.arteditor.ui.main.MainViewModel getMainViewModel() {
        return null;
    }
    
    public final void setMainViewModel(@org.jetbrains.annotations.NotNull
    vn.tapbi.arteditor.ui.main.MainViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    protected abstract java.lang.Class<T> getViewModel();
    
    public abstract int getLayoutId();
    
    protected abstract void observerData();
    
    protected abstract void onCreatedView(@org.jetbrains.annotations.Nullable
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState);
    
    protected abstract void onPermissionGranted();
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public boolean needInsetTop() {
        return false;
    }
    
    public boolean needToKeepView() {
        return false;
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    protected final boolean checkTime() {
        return false;
    }
}