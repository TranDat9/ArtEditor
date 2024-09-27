package vn.tapbi.arteditor;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import vn.tapbi.arteditor.databinding.ActivityMainBindingImpl;
import vn.tapbi.arteditor.databinding.BottomSheetDownloadBindingImpl;
import vn.tapbi.arteditor.databinding.DownloadFragmentBindingImpl;
import vn.tapbi.arteditor.databinding.FavouriteFragmentBindingImpl;
import vn.tapbi.arteditor.databinding.HomeFragmentBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_BOTTOMSHEETDOWNLOAD = 2;

  private static final int LAYOUT_DOWNLOADFRAGMENT = 3;

  private static final int LAYOUT_FAVOURITEFRAGMENT = 4;

  private static final int LAYOUT_HOMEFRAGMENT = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.tapbi.arteditor.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.tapbi.arteditor.R.layout.bottom_sheet_download, LAYOUT_BOTTOMSHEETDOWNLOAD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.tapbi.arteditor.R.layout.download_fragment, LAYOUT_DOWNLOADFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.tapbi.arteditor.R.layout.favourite_fragment, LAYOUT_FAVOURITEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(vn.tapbi.arteditor.R.layout.home_fragment, LAYOUT_HOMEFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_BOTTOMSHEETDOWNLOAD: {
          if ("layout/bottom_sheet_download_0".equals(tag)) {
            return new BottomSheetDownloadBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for bottom_sheet_download is invalid. Received: " + tag);
        }
        case  LAYOUT_DOWNLOADFRAGMENT: {
          if ("layout/download_fragment_0".equals(tag)) {
            return new DownloadFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for download_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_FAVOURITEFRAGMENT: {
          if ("layout/favourite_fragment_0".equals(tag)) {
            return new FavouriteFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for favourite_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_HOMEFRAGMENT: {
          if ("layout/home_fragment_0".equals(tag)) {
            return new HomeFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for home_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_main_0", vn.tapbi.arteditor.R.layout.activity_main);
      sKeys.put("layout/bottom_sheet_download_0", vn.tapbi.arteditor.R.layout.bottom_sheet_download);
      sKeys.put("layout/download_fragment_0", vn.tapbi.arteditor.R.layout.download_fragment);
      sKeys.put("layout/favourite_fragment_0", vn.tapbi.arteditor.R.layout.favourite_fragment);
      sKeys.put("layout/home_fragment_0", vn.tapbi.arteditor.R.layout.home_fragment);
    }
  }
}
