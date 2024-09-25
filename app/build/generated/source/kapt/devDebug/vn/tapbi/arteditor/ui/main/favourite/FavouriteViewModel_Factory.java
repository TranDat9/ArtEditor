package vn.tapbi.arteditor.ui.main.favourite;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class FavouriteViewModel_Factory implements Factory<FavouriteViewModel> {
  @Override
  public FavouriteViewModel get() {
    return newInstance();
  }

  public static FavouriteViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FavouriteViewModel newInstance() {
    return new FavouriteViewModel();
  }

  private static final class InstanceHolder {
    private static final FavouriteViewModel_Factory INSTANCE = new FavouriteViewModel_Factory();
  }
}
