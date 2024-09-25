package vn.tapbi.arteditor.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lvn/tapbi/arteditor/ui/adapter/PhotoAdapter;", "Landroidx/paging/PagingDataAdapter;", "Lvn/tapbi/arteditor/data/model/UnsplashPhotoModel;", "Lvn/tapbi/arteditor/ui/adapter/PhotoAdapter$PhotoViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "PhotoViewHolder", "app_devDebug"})
public final class PhotoAdapter extends androidx.paging.PagingDataAdapter<vn.tapbi.arteditor.data.model.UnsplashPhotoModel, vn.tapbi.arteditor.ui.adapter.PhotoAdapter.PhotoViewHolder> {
    @org.jetbrains.annotations.NotNull
    public static final vn.tapbi.arteditor.ui.adapter.PhotoAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<vn.tapbi.arteditor.data.model.UnsplashPhotoModel> PHOTO_COMPARATOR = null;
    
    public PhotoAdapter() {
        super(null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public vn.tapbi.arteditor.ui.adapter.PhotoAdapter.PhotoViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    vn.tapbi.arteditor.ui.adapter.PhotoAdapter.PhotoViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lvn/tapbi/arteditor/ui/adapter/PhotoAdapter$PhotoViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lvn/tapbi/arteditor/databinding/ItemPhotoBinding;", "(Lvn/tapbi/arteditor/ui/adapter/PhotoAdapter;Lvn/tapbi/arteditor/databinding/ItemPhotoBinding;)V", "bind", "", "photo", "Lvn/tapbi/arteditor/data/model/UnsplashPhotoModel;", "app_devDebug"})
    public final class PhotoViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private vn.tapbi.arteditor.databinding.ItemPhotoBinding binding;
        
        public PhotoViewHolder(@org.jetbrains.annotations.NotNull
        vn.tapbi.arteditor.databinding.ItemPhotoBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        vn.tapbi.arteditor.data.model.UnsplashPhotoModel photo) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lvn/tapbi/arteditor/ui/adapter/PhotoAdapter$Companion;", "", "()V", "PHOTO_COMPARATOR", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lvn/tapbi/arteditor/data/model/UnsplashPhotoModel;", "app_devDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}