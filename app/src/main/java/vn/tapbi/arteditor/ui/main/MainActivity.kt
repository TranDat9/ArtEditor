package vn.tapbi.arteditor.ui.main

import android.os.Bundle

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import dagger.hilt.android.AndroidEntryPoint
import vn.tapbi.arteditor.R
import vn.tapbi.arteditor.databinding.ActivityMainBinding
import vn.tapbi.arteditor.ui.base.BaseBindingActivity


class MainActivity : BaseBindingActivity<ActivityMainBinding, MainViewModel>() {

    override val layoutId: Int
        get() = R.layout.activity_main

    override fun getViewModel(): Class<MainViewModel> {
        return MainViewModel::class.java
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragment) as NavHostFragment?
        val navController = navHostFragment!!.navController
        binding?.bottomNav?.setupWithNavController(navController)

    }

    override fun setupView(savedInstanceState: Bundle?) {

    }

    override fun setupData() {

    }

}