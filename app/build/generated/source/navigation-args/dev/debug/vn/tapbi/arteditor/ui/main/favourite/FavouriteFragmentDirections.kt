package vn.tapbi.arteditor.ui.main.favourite

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import vn.tapbi.arteditor.R

public class FavouriteFragmentDirections private constructor() {
  public companion object {
    public fun actionFavouriteFragmentToDownloadFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_favouriteFragment_to_downloadFragment)
  }
}
