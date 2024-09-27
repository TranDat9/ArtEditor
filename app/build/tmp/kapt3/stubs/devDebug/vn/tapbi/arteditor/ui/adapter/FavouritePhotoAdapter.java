package vn.tapbi.arteditor.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0014\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lvn/tapbi/arteditor/ui/adapter/FavouritePhotoAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lvn/tapbi/arteditor/ui/adapter/FavouritePhotoAdapter$PhotoViewHolder;", "listener", "Lvn/tapbi/arteditor/ui/adapter/WallInteractionListener;", "(Lvn/tapbi/arteditor/ui/adapter/WallInteractionListener;)V", "photos", "", "Lvn/tapbi/arteditor/data/model/UnsplashPhotoModel;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setPhotos", "newPhotos", "", "PhotoViewHolder", "app_devDebug"})
public final class FavouritePhotoAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<vn.tapbi.arteditor.ui.adapter.FavouritePhotoAdapter.PhotoViewHolder> {
    private final vn.tapbi.arteditor.ui.adapter.WallInteractionListener listener = null;
    private final java.util.List<vn.tapbi.arteditor.data.model.UnsplashPhotoModel> photos = null;
    
    public FavouritePhotoAdapter(@org.jetbrains.annotations.NotNull
    vn.tapbi.arteditor.ui.adapter.WallInteractionListener listener) {
        super();
    }
    
    public final void setPhotos(@org.jetbrains.annotations.NotNull
    java.util.List<vn.tapbi.arteditor.data.model.UnsplashPhotoModel> newPhotos) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public vn.tapbi.arteditor.ui.adapter.FavouritePhotoAdapter.PhotoViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    vn.tapbi.arteditor.ui.adapter.FavouritePhotoAdapter.PhotoViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lvn/tapbi/arteditor/ui/adapter/FavouritePhotoAdapter$PhotoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lvn/tapbi/arteditor/databinding/ItemPhotoBinding;", "(Lvn/tapbi/arteditor/ui/adapter/FavouritePhotoAdapter;Lvn/tapbi/arteditor/databinding/ItemPhotoBinding;)V", "bind", "", "photo", "Lvn/tapbi/arteditor/data/model/UnsplashPhotoModel;", "app_devDebug"})
    public final class PhotoViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final vn.tapbi.arteditor.databinding.ItemPhotoBinding binding = null;
        
        public PhotoViewHolder(@org.jetbrains.annotations.NotNull
        vn.tapbi.arteditor.databinding.ItemPhotoBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        vn.tapbi.arteditor.data.model.UnsplashPhotoModel photo) {
        }
    }
}