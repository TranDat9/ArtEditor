package vn.tapbi.sample2021kotlin.interfaces;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lvn/tapbi/sample2021kotlin/interfaces/OnDataListener;", "", "onDataUpdated", "", "threadModel", "Lvn/tapbi/arteditor/data/model/MessageThreadModel;", "position", "", "app_devDebug"})
public abstract interface OnDataListener {
    
    public abstract void onDataUpdated(@org.jetbrains.annotations.Nullable
    vn.tapbi.arteditor.data.model.MessageThreadModel threadModel, int position);
}