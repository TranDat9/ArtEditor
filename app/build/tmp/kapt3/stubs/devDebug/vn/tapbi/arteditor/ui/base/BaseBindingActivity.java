package vn.tapbi.arteditor.ui.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\n\b\u0000\u0010\u0001*\u0004\u0018\u00010\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H&J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0019H&J\u0012\u0010\u001d\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&R\u001e\u0010\u0007\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00018\u0001X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001e"}, d2 = {"Lvn/tapbi/arteditor/ui/base/BaseBindingActivity;", "B", "Landroidx/databinding/ViewDataBinding;", "VM", "Lvn/tapbi/arteditor/ui/base/BaseViewModel;", "Lvn/tapbi/arteditor/ui/base/BaseActivity;", "()V", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "layoutId", "", "getLayoutId", "()I", "viewModel", "getViewModel", "()Lvn/tapbi/arteditor/ui/base/BaseViewModel;", "setViewModel", "(Lvn/tapbi/arteditor/ui/base/BaseViewModel;)V", "Lvn/tapbi/arteditor/ui/base/BaseViewModel;", "Ljava/lang/Class;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setupData", "setupView", "app_devDebug"})
public abstract class BaseBindingActivity<B extends androidx.databinding.ViewDataBinding, VM extends vn.tapbi.arteditor.ui.base.BaseViewModel> extends vn.tapbi.arteditor.ui.base.BaseActivity {
    @org.jetbrains.annotations.Nullable
    private B binding;
    @org.jetbrains.annotations.Nullable
    private VM viewModel;
    
    public BaseBindingActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final B getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.Nullable
    B p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final VM getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.Nullable
    VM p0) {
    }
    
    public abstract int getLayoutId();
    
    @org.jetbrains.annotations.NotNull
    public abstract java.lang.Class<VM> getViewModel();
    
    public abstract void setupView(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState);
    
    public abstract void setupData();
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
}