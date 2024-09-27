package vn.tapbi.arteditor.ui.main.download

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import vn.tapbi.arteditor.R
import vn.tapbi.arteditor.databinding.DownloadFragmentBinding
import vn.tapbi.arteditor.ui.base.BaseBindingFragment
import vn.tapbi.arteditor.ui.main.bottom_sheet.BottomSheetFragment
import vn.tapbi.arteditor.ui.main.favourite.FavouriteViewModel

class DownloadFragment : BaseBindingFragment<DownloadFragmentBinding,DownloadViewModel>() {

    private var imageData : Array<String>? = null

    override fun getViewModel(): Class<DownloadViewModel> {
        return DownloadViewModel::class.java
    }

    override val layoutId: Int
        get() = R.layout.download_fragment

    override fun observerData() {

    }

    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {

         imageData = arguments?.getStringArray("imageData")
        imageData?.let {
            loadPhoto(it[0])
        }
        //loadPhoto(args.imageData[0])
        addCallBack()
        bottomSheet()
    }

    override fun onPermissionGranted() {

    }

    private fun loadPhoto(url : String) {
       // val blurHash = BlurHashDecoder.decode(args.imageData[1])
        Glide.with(this)
            .load(url)
            .centerCrop()
            //.placeholder(blurHash?.toDrawable(this.resources))
            //.error(blurHash)
            .into(binding.downloadImage)
    }

    private fun addCallBack() {
        binding.backButton.setOnClickListener {
           findNavController().popBackStack()
        }
    }

    private fun bottomSheet() {
        val bottomSheetFragment = BottomSheetFragment.newInstance(imageData!![0])
        binding.downloadButton.setOnClickListener {
            bottomSheetFragment.show(requireActivity().supportFragmentManager, "bottomSheet")
        }
    }


}