package vn.tapbi.arteditor.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import vn.tapbi.arteditor.R
import vn.tapbi.arteditor.data.model.UnsplashPhotoModel
import vn.tapbi.arteditor.data.repository.UnSplashPhotoRepository
import vn.tapbi.arteditor.databinding.ItemPhotoBinding
import javax.inject.Inject

class PhotoAdapter
    : PagingDataAdapter<UnsplashPhotoModel, PhotoAdapter.PhotoViewHolder>(PHOTO_COMPARATOR) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val binding: ItemPhotoBinding =ItemPhotoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return  PhotoViewHolder(binding)

    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        val photo = getItem(position)
        if (photo != null) {
            holder.bind(photo)
        }
    }

    inner class PhotoViewHolder(private var binding: ItemPhotoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(photo: UnsplashPhotoModel) {
                Glide.with(binding.root)
                    .load(photo.urlsParse)
                    .placeholder(R.drawable.ic_launcher_background)
                    .error(R.drawable.ic_launcher_background)
                    .into(binding.photoImageView)

         if (photo.like == true) {
                binding.likeImageView.setImageResource(R.drawable.ic_like)
            }

            binding.likeImageView.setOnClickListener {
                photo.like = true
                binding.likeImageView.setImageResource(R.drawable.ic_like)
                //this@PhotoAdapter.updatePhotoLike(photo = photo)
            }

        }
    }

//    private fun updatePhotoLike(photo: UnsplashPhotoModel) {
//        // Use a coroutine to update the photo like status in the database
//        CoroutineScope(Dispatchers.IO).launch {
//            photoRepository.updatePhotoLike(photo)
//        }
//    }

    companion object {
        private val PHOTO_COMPARATOR = object : DiffUtil.ItemCallback<UnsplashPhotoModel>() {
            override fun areItemsTheSame(oldItem: UnsplashPhotoModel, newItem: UnsplashPhotoModel): Boolean =
                oldItem.id == newItem.id

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(oldItem: UnsplashPhotoModel, newItem: UnsplashPhotoModel): Boolean =
                oldItem == newItem
        }
    }
}
