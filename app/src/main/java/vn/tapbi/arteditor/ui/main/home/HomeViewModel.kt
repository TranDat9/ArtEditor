package vn.tapbi.arteditor.ui.main.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import timber.log.Timber
import vn.tapbi.arteditor.data.model.UnsplashPhotoModel
import vn.tapbi.arteditor.ui.base.BaseViewModel
import vn.tapbi.arteditor.data.repository.UnSplashPhotoRepository
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
    private val photoRepository: UnSplashPhotoRepository
) : BaseViewModel() {

    // LiveData to observe photo data from the repository
    val photoLiveData: LiveData<List<UnsplashPhotoModel>> = photoRepository.getAllPhotos()

    // Function to fetch photos and update Room database
    fun refreshPhotos(clientId: String, category: String) {
        viewModelScope.launch(Dispatchers.IO + CoroutineExceptionHandler { _, throwable ->
            Timber.e(throwable)
        }) {
            try {
                // Call repository to fetch photos from API and store in Room
                photoRepository.refreshPhotos(clientId, category)
            } catch (e: Exception) {
                Timber.e(e)
            }
        }
    }

    fun getPhotosByCategory(category: String): LiveData<PagingData<UnsplashPhotoModel>> {
        return photoRepository.getPhotosByCategory(category)
            .cachedIn(viewModelScope)
            .asLiveData()
    }


}


