package vn.tapbi.arteditor.ui.main.favourite;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lvn/tapbi/arteditor/ui/main/favourite/FavouriteViewModel;", "Lvn/tapbi/arteditor/ui/base/BaseViewModel;", "photoRepository", "Lvn/tapbi/arteditor/data/repository/UnSplashPhotoRepository;", "(Lvn/tapbi/arteditor/data/repository/UnSplashPhotoRepository;)V", "favouritePhotos", "Landroidx/lifecycle/LiveData;", "", "Lvn/tapbi/arteditor/data/model/UnsplashPhotoModel;", "getFavouritePhotos", "()Landroidx/lifecycle/LiveData;", "app_devDebug"})
public final class FavouriteViewModel extends vn.tapbi.arteditor.ui.base.BaseViewModel {
    private final vn.tapbi.arteditor.data.repository.UnSplashPhotoRepository photoRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<vn.tapbi.arteditor.data.model.UnsplashPhotoModel>> favouritePhotos = null;
    
    @javax.inject.Inject
    public FavouriteViewModel(@org.jetbrains.annotations.NotNull
    vn.tapbi.arteditor.data.repository.UnSplashPhotoRepository photoRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<vn.tapbi.arteditor.data.model.UnsplashPhotoModel>> getFavouritePhotos() {
        return null;
    }
}