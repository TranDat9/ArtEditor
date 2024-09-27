package vn.tapbi.arteditor.ui.main.home

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import vn.tapbi.arteditor.R

public class HomeFragmentDirections private constructor() {
  public companion object {
    public fun actionHomeFragmentToFavouriteFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_favouriteFragment)
  }
}
