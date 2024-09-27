package vn.tapbi.arteditor.ui.main.favourite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import vn.tapbi.arteditor.R
import vn.tapbi.arteditor.data.model.UnsplashPhotoModel
import vn.tapbi.arteditor.databinding.FavouriteFragmentBinding
import vn.tapbi.arteditor.ui.adapter.FavouritePhotoAdapter
import vn.tapbi.arteditor.ui.adapter.WallInteractionListener
import vn.tapbi.arteditor.ui.base.BaseBindingFragment
import vn.tapbi.arteditor.utils.Constants

class FavouriteFragment : BaseBindingFragment<FavouriteFragmentBinding, FavouriteViewModel>(),
WallInteractionListener{


    private lateinit var favouritePhotoAdapter: FavouritePhotoAdapter

        override fun getViewModel(): Class<FavouriteViewModel> {
            return FavouriteViewModel::class.java
        }

        override val layoutId: Int
            get() = R.layout.favourite_fragment

    override fun observerData() {

        viewModel.favouritePhotos.observe(viewLifecycleOwner, { photos ->
            favouritePhotoAdapter.setPhotos(photos)
        })

    }

    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {
        favouritePhotoAdapter = FavouritePhotoAdapter(this)
        binding.recyclerViewFavourite.layoutManager = GridLayoutManager(context, 2)
        binding.recyclerViewFavourite.adapter = favouritePhotoAdapter
    }

    override fun onPermissionGranted() {

    }

    override fun onClickItem(data: UnsplashPhotoModel, view: View) {
        val imageData = arrayOf(data.urlsParse.toString(), data.id)
                        val bundle = Bundle().apply {
                            putStringArray("imageData", imageData)
                        }
                        Navigation.findNavController(view)
                            .navigate(R.id.action_favouriteFragment_to_downloadFragment, bundle)
                    }


}