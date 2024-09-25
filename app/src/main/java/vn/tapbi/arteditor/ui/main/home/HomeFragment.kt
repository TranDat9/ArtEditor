package vn.tapbi.arteditor.ui.main.home

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import vn.tapbi.arteditor.R
import vn.tapbi.arteditor.common.Constant
import vn.tapbi.arteditor.databinding.HomeFragmentBinding
import vn.tapbi.arteditor.ui.adapter.CategoryAdapter
import vn.tapbi.arteditor.ui.base.BaseBindingFragment
import javax.inject.Inject


class HomeFragment : BaseBindingFragment<HomeFragmentBinding, HomeViewModel>() {
    private var categoriesList = ArrayList<String>()

    private lateinit var categoryAdapter: CategoryAdapter


    override fun getViewModel(): Class<HomeViewModel> {
        return HomeViewModel::class.java
    }

    override val layoutId: Int
        get() = R.layout.home_fragment

    override fun observerData() {
        // Observe LiveData from ViewModel
//        viewModel.photoLiveData.observe(viewLifecycleOwner) { photoList ->
//            if (photoList != null && photoList.isNotEmpty()) {
//
//                Log.d("HomeFragment", "Photo list size: ${photoList.size}")
//
//                photoList.forEach { photo ->
//                    Log.d("HomeFragment", "Photo ID: ${photo.nameTopic}, URL: ${photo.urlsParse}")
//                }
//
//            } else {
//                Log.d("HomeFragment", "No photos received or list is empty")
//            }
//        }
        // Call refresh to fetch photos from API
//        viewModel.refreshPhotos(Constant.CLIENT_ID, "fashion")
//        viewModel.refreshPhotos(Constant.CLIENT_ID, "nature")
//        viewModel.refreshPhotos(Constant.CLIENT_ID, "beauty")
//        viewModel.refreshPhotos(Constant.CLIENT_ID, "film")
//        viewModel.refreshPhotos(Constant.CLIENT_ID, "party")

//        lifecycleScope.launch {
//            viewModel.getPhotosByCategory("nature").collectLatest { pagingData ->
//                pagingData?.let { data ->
//                    data.map { photo ->
//                        Log.d("HomeFragment", "Photo ID: ${photo.id}, URL: ${photo.urls}")
//                    }
//                } ?: Log.d("HomeFragment", "No photos received or list is empty")
//            }
//        }
    }

    override fun onCreatedView(view: View?, savedInstanceState: Bundle?) {
        if (isNetworkAvailable(requireContext())) {
            binding.linearLayout.visibility = View.VISIBLE
            binding.linearLayoutNoInternet.visibility = View.GONE
        } else {
            binding.linearLayout.visibility = View.GONE

        }
        initCategoriesList()
    }

    override fun onPermissionGranted() {

    }

    fun isNetworkAvailable(context: Context): Boolean {
        val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val network = connectivityManager.activeNetwork ?: return false
            val activeNetwork = connectivityManager.getNetworkCapabilities(network) ?: return false
            return when {
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                else -> false
            }
        } else {
            @Suppress("DEPRECATION")
            val networkInfo = connectivityManager.activeNetworkInfo ?: return false
            @Suppress("DEPRECATION")
            return networkInfo.isConnected
        }
    }



    private fun initCategoriesList() {

        categoriesList.add(getString(R.string.fashion))
        categoriesList.add(getString(R.string.nature))
        categoriesList.add(getString(R.string.beauty))
        categoriesList.add(getString(R.string.film))
        categoriesList.add(getString(R.string.party))

        binding.recyclerViewCategory.layoutManager = LinearLayoutManager(context)
        binding.recyclerViewCategory.setHasFixedSize(true)

        categoryAdapter = CategoryAdapter(viewModel,viewLifecycleOwner)
        binding.recyclerViewCategory.adapter = categoryAdapter
        categoryAdapter.setCategories(categoriesList)

//        moviesListAdapter = CategoriesAdapter(categoriesList,  activity!!)
//        if (rvCategories.adapter==null)
//            rvCategories.adapter = moviesListAdapter

//        if (details?.comics!=null)
//            viewModel.fetchItems(""+details?.resourceURI+ "/comics",0)
//
//        if (details?.series!=null)
//            viewModel.fetchItems(""+details?.resourceURI+ "/series",1)
//
//        if (details?.stories!=null)
//            viewModel.fetchItems(""+details?.resourceURI+ "/stories",2)
//
//        if (details?.events!=null)
//            viewModel.fetchItems(""+details?.resourceURI+ "/events",3)
//
//        viewModel.stateLiveData.observe(this,
//            Observer<Event<NetworkState>> {
//                (it).getContentIfNotHandled()?.let {
//                    // Only proceed if the event has never been handled
//                    when (it.status) {
//                        Status.RUNNING -> {
//                        }
//                        Status.SUCCESS -> {
//                        }
//                        Status.FAILED -> {
//                            context?.toast("" + it.message)
//                        }}
//                }  })
//
//        viewModel.charactersLiveData.observe(this,
//            Observer<Any> {
//                (it as Event<*>).getContentIfNotHandled()?.let {
//                    // Only proceed if the event has never been handled
//                    val pair = it as Pair<*, *>
//                    val data = pair.first as CharactersDetailsResponse
//                    val type = pair.second
//                    Timber.e(""+data.toString())
//                    Timber.e(""+data.data?.results.toString())
//
//                    val movies = mutableListOf<movie?>()
//                    val resultLists = data.data?.results
//                    resultLists?.map {
//                        movies.add(movie(""+it?.title ,""+it?.thumbnail?.path ) )
//                    }
//
//                    if (type==0) {
//                        moviesListAdapter?.addComicsList(movies)
//                    }
//                    else if (type==1){
//                        moviesListAdapter?.addSeriesList(movies)
//                    }
//                    else if(type==2){
//                        moviesListAdapter?.addStoriesList(movies)
//                    }
//                    else{
//                        moviesListAdapter?.addEventsList(movies)
//                    }
//
//                }
//            }
//        )
  }
}

