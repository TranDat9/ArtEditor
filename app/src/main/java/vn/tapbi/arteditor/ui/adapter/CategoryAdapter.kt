package vn.tapbi.arteditor.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import vn.tapbi.arteditor.R
import vn.tapbi.arteditor.ui.main.home.HomeViewModel

class CategoryAdapter(
    private val viewModel: HomeViewModel,
    private val lifecycleOwner: LifecycleOwner
) : RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>() {

    private val categories = mutableListOf<String>()

    fun setCategories(newCategories: List<String>) {
        categories.clear()
        categories.addAll(newCategories)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_topic, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categories[position]
        holder.bind(category)
    }

    override fun getItemCount(): Int = categories.size

    inner class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val recyclerView = itemView.findViewById<RecyclerView>(R.id.recyclerView)
        private val photoAdapter = PhotoAdapter()

        fun bind(category: String) {

            itemView.findViewById<TextView>(R.id.nameTopic).text = category
            // Gán adapter cho RecyclerView con
            recyclerView.adapter = photoAdapter
            recyclerView.layoutManager = LinearLayoutManager(itemView.context, LinearLayoutManager.HORIZONTAL, false)

            viewModel.getPhotosByCategory(category).observe(lifecycleOwner, { pagingData ->
                photoAdapter.submitData(lifecycleOwner.lifecycle, pagingData)
            })

        }
    }
}
