package vn.tapbi.arteditor.ui.main.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0011H\u0014J\u001c\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0011H\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u001d"}, d2 = {"Lvn/tapbi/arteditor/ui/main/home/HomeFragment;", "Lvn/tapbi/arteditor/ui/base/BaseBindingFragment;", "Lvn/tapbi/arteditor/databinding/HomeFragmentBinding;", "Lvn/tapbi/arteditor/ui/main/home/HomeViewModel;", "()V", "categoriesList", "Ljava/util/ArrayList;", "", "categoryAdapter", "Lvn/tapbi/arteditor/ui/adapter/CategoryAdapter;", "layoutId", "", "getLayoutId", "()I", "getViewModel", "Ljava/lang/Class;", "initCategoriesList", "", "isNetworkAvailable", "", "context", "Landroid/content/Context;", "observerData", "onCreatedView", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onPermissionGranted", "app_devDebug"})
public final class HomeFragment extends vn.tapbi.arteditor.ui.base.BaseBindingFragment<vn.tapbi.arteditor.databinding.HomeFragmentBinding, vn.tapbi.arteditor.ui.main.home.HomeViewModel> {
    private java.util.ArrayList<java.lang.String> categoriesList;
    private vn.tapbi.arteditor.ui.adapter.CategoryAdapter categoryAdapter;
    
    public HomeFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected java.lang.Class<vn.tapbi.arteditor.ui.main.home.HomeViewModel> getViewModel() {
        return null;
    }
    
    @java.lang.Override
    public int getLayoutId() {
        return 0;
    }
    
    @java.lang.Override
    protected void observerData() {
    }
    
    @java.lang.Override
    protected void onCreatedView(@org.jetbrains.annotations.Nullable
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    protected void onPermissionGranted() {
    }
    
    public final boolean isNetworkAvailable(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return false;
    }
    
    private final void initCategoriesList() {
    }
}