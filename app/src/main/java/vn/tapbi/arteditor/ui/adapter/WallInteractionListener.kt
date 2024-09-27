package vn.tapbi.arteditor.ui.adapter

import android.view.View
import vn.tapbi.arteditor.data.model.UnsplashPhotoModel

interface WallInteractionListener {
    fun onClickItem(data: UnsplashPhotoModel, view: View)
}