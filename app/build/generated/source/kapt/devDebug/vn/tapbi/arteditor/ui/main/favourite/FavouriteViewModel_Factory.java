package vn.tapbi.arteditor.ui.main.favourite;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import vn.tapbi.arteditor.data.repository.UnSplashPhotoRepository;

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
  private final Provider<UnSplashPhotoRepository> photoRepositoryProvider;

  public FavouriteViewModel_Factory(Provider<UnSplashPhotoRepository> photoRepositoryProvider) {
    this.photoRepositoryProvider = photoRepositoryProvider;
  }

  @Override
  public FavouriteViewModel get() {
    return newInstance(photoRepositoryProvider.get());
  }

  public static FavouriteViewModel_Factory create(
      Provider<UnSplashPhotoRepository> photoRepositoryProvider) {
    return new FavouriteViewModel_Factory(photoRepositoryProvider);
  }

  public static FavouriteViewModel newInstance(UnSplashPhotoRepository photoRepository) {
    return new FavouriteViewModel(photoRepository);
  }
}
