package vn.tapbi.arteditor.ui.main.download

import androidx.lifecycle.LiveData
import androidx.navigation.fragment.navArgs
import dagger.hilt.android.lifecycle.HiltViewModel
import vn.tapbi.arteditor.data.model.UnsplashPhotoModel
import vn.tapbi.arteditor.data.repository.UnSplashPhotoRepository
import vn.tapbi.arteditor.ui.base.BaseViewModel
import javax.inject.Inject

@HiltViewModel
class DownloadViewModel@Inject constructor(
    private val photoRepository: UnSplashPhotoRepository
) : BaseViewModel() {

}