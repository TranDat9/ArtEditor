package vn.tapbi.arteditor.ui.main.favourite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u0014J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u0018\u001a\u00020\u000fH\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lvn/tapbi/arteditor/ui/main/favourite/FavouriteFragment;", "Lvn/tapbi/arteditor/ui/base/BaseBindingFragment;", "Lvn/tapbi/arteditor/databinding/FavouriteFragmentBinding;", "Lvn/tapbi/arteditor/ui/main/favourite/FavouriteViewModel;", "Lvn/tapbi/arteditor/ui/adapter/WallInteractionListener;", "()V", "favouritePhotoAdapter", "Lvn/tapbi/arteditor/ui/adapter/FavouritePhotoAdapter;", "layoutId", "", "getLayoutId", "()I", "getViewModel", "Ljava/lang/Class;", "observerData", "", "onClickItem", "data", "Lvn/tapbi/arteditor/data/model/UnsplashPhotoModel;", "view", "Landroid/view/View;", "onCreatedView", "savedInstanceState", "Landroid/os/Bundle;", "onPermissionGranted", "app_devDebug"})
public final class FavouriteFragment extends vn.tapbi.arteditor.ui.base.BaseBindingFragment<vn.tapbi.arteditor.databinding.FavouriteFragmentBinding, vn.tapbi.arteditor.ui.main.favourite.FavouriteViewModel> implements vn.tapbi.arteditor.ui.adapter.WallInteractionListener {
    private vn.tapbi.arteditor.ui.adapter.FavouritePhotoAdapter favouritePhotoAdapter;
    
    public FavouriteFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    protected java.lang.Class<vn.tapbi.arteditor.ui.main.favourite.FavouriteViewModel> getViewModel() {
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
    
    @java.lang.Override
    public void onClickItem(@org.jetbrains.annotations.NotNull
    vn.tapbi.arteditor.data.model.UnsplashPhotoModel data, @org.jetbrains.annotations.NotNull
    android.view.View view) {
    }
}