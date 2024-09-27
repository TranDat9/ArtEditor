package vn.tapbi.arteditor.ui.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import vn.tapbi.arteditor.R
import vn.tapbi.arteditor.data.model.UnsplashPhotoModel
import vn.tapbi.arteditor.databinding.ItemPhotoBinding
import vn.tapbi.arteditor.ui.main.favourite.FavouriteFragmentDirections
import vn.tapbi.arteditor.utils.Constants

class FavouritePhotoAdapter(private val listener: WallInteractionListener)
    : RecyclerView.Adapter<FavouritePhotoAdapter.PhotoViewHolder>() {

    private val photos = mutableListOf<UnsplashPhotoModel>()

    fun setPhotos(newPhotos: List<UnsplashPhotoModel>) {
        photos.clear()
        photos.addAll(newPhotos)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        val binding = ItemPhotoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PhotoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        holder.bind(photos[position])
    }

    override fun getItemCount(): Int = photos.size

    inner class PhotoViewHolder(private val binding: ItemPhotoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(photo: UnsplashPhotoModel) {
            Glide.with(binding.root)
                .load(photo.urlsParse)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(binding.photoImageView)

            if (photo.like) {
                binding.likeImageView.setImageResource(R.drawable.ic_like)
            } else {
                binding.likeImageView.setImageResource(R.drawable.ic_unlike)
            }

            binding.likeImageView.setOnClickListener {
                photo.like = !photo.like
                if (photo.like) {
                    binding.likeImageView.setImageResource(R.drawable.ic_like)
                } else {
                    binding.likeImageView.setImageResource(R.drawable.ic_unlike)
                }
                notifyItemChanged(bindingAdapterPosition)
            }


            binding.root.setOnClickListener {
                listener.onClickItem(photo,it)

//                when(navigationId) {
//
//                    Constants.NavigationIntent.FromHomeToDownload -> {
//                        val bundle = Bundle().apply {
//                            putStringArray("imageData", imageData)
//                        }
//                        Navigation.findNavController(v)
//                            .navigate(R.id.action_favouriteFragment_to_downloadFragment, bundle)
//                    }
//                }
            }

        }
    }
}