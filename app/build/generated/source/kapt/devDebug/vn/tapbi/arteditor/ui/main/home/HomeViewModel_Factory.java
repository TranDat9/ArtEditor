package vn.tapbi.arteditor.ui.main.home;

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
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<UnSplashPhotoRepository> photoRepositoryProvider;

  public HomeViewModel_Factory(Provider<UnSplashPhotoRepository> photoRepositoryProvider) {
    this.photoRepositoryProvider = photoRepositoryProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(photoRepositoryProvider.get());
  }

  public static HomeViewModel_Factory create(
      Provider<UnSplashPhotoRepository> photoRepositoryProvider) {
    return new HomeViewModel_Factory(photoRepositoryProvider);
  }

  public static HomeViewModel newInstance(UnSplashPhotoRepository photoRepository) {
    return new HomeViewModel(photoRepository);
  }
}
