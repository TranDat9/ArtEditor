package vn.tapbi.sample2021kotlin.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0003\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003\u00a8\u0006\u0005"}, d2 = {"hideKeyboard", "", "Landroid/app/Activity;", "Landroid/view/View;", "showKeyboard", "app_devDebug"})
public final class KeyboardExKt {
    
    /**
     * Use only from Activities, don't use from Fragment (with getActivity) or from Dialog/DialogFragment
     */
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull
    android.app.Activity $this$hideKeyboard) {
    }
    
    public static final void showKeyboard(@org.jetbrains.annotations.NotNull
    android.view.View $this$showKeyboard) {
    }
    
    /**
     * Use everywhere except from Activity (Custom View, Fragment, Dialogs, DialogFragments).
     */
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull
    android.view.View $this$hideKeyboard) {
    }
}