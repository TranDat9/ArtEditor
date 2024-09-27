package vn.tapbi.arteditor.ui.main.favourite

import androidx.lifecycle.LiveData
import dagger.hilt.android.lifecycle.HiltViewModel
import vn.tapbi.arteditor.data.model.UnsplashPhotoModel
import vn.tapbi.arteditor.data.repository.UnSplashPhotoRepository
import vn.tapbi.arteditor.ui.base.BaseViewModel
import javax.inject.Inject


@HiltViewModel
class FavouriteViewModel @Inject constructor(
    private val photoRepository: UnSplashPhotoRepository
) : BaseViewModel() {

    val favouritePhotos: LiveData<List<UnsplashPhotoModel>> = photoRepository.getLikedPhotos()

}