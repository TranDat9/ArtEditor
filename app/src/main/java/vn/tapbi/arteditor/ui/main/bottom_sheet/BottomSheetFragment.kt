package vn.tapbi.arteditor.ui.main.bottom_sheet

import android.app.DownloadManager
import android.app.WallpaperManager
import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Environment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.imageview.ShapeableImageView
import vn.tapbi.arteditor.R
import vn.tapbi.arteditor.databinding.BottomSheetDownloadBinding
import vn.tapbi.arteditor.utils.Constants
import java.io.File

class BottomSheetFragment : BottomSheetDialogFragment() {

    private lateinit var binding: BottomSheetDownloadBinding
    private var walUrl: String? = null

    //Constructor không tham số: Android yêu cầu các fragment phải có constructor không tham số để
    // có thể khởi tạo lại fragment khi cần thiết (ví dụ: khi xoay màn hình).
    //Phương thức newInstance: Được sử dụng để tạo một instance của fragment với các tham số
    // cần thiết. Điều này giúp đảm bảo rằng fragment luôn có constructor không tham số và các tham số được truyền qua Bundle.
    companion object {
        private const val ARG_WAL_URL = "walUrl"
        fun newInstance(walUrl: String): BottomSheetFragment {
            val fragment = BottomSheetFragment()
            val args = Bundle()
            args.putString(ARG_WAL_URL, walUrl)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        walUrl = arguments?.getString(ARG_WAL_URL)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = BottomSheetDownloadBinding.inflate(inflater, container, false)
        initButtons()
        return binding.root
    }

    private fun initButtons() {
        binding.DownLoadFromNet.setOnClickListener { walUrl?.let { downloadImageFromNet(it) } }
        binding.setAsBackground.setOnClickListener { setAsBackground(Constants.background.homeScreen) }
        binding.setAsLockScreen.setOnClickListener { setAsBackground(Constants.background.lockScreen) }
    }

    private fun downloadImageFromNet(url: String) {
        try {
            val downloadManager = context?.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager

            val imageUri = Uri.parse(url)
            val request = DownloadManager.Request(imageUri).apply {
                setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI or DownloadManager.Request.NETWORK_MOBILE)
                setMimeType("image/*")
                setAllowedOverRoaming(false)
                setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
                setTitle("wool")
                setDestinationInExternalPublicDir(
                    Environment.DIRECTORY_DOWNLOADS,
                    File.separator + "wool" + ".jpg"
                )
            }
            downloadManager.enqueue(request)
            Toast.makeText(context, "Downloading...", Toast.LENGTH_SHORT).show()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun setAsBackground(LockOrBackground: Int) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            try {
                val wallpaperManager = WallpaperManager.getInstance(context)
                val image = activity?.findViewById<ShapeableImageView>(R.id.download_image)
                if (image?.drawable == null) {
                    Toast.makeText(context, "wait to download...", Toast.LENGTH_SHORT).show()
                } else {
                    val bitmap = (image.drawable as BitmapDrawable).bitmap
                    wallpaperManager.setBitmap(bitmap, null, true, LockOrBackground)
                    Toast.makeText(context, "Set wallpaper successfully", Toast.LENGTH_SHORT).show()
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}