package vn.tapbi.arteditor.ui.main.download;

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
public final class DownloadViewModel_Factory implements Factory<DownloadViewModel> {
  private final Provider<UnSplashPhotoRepository> photoRepositoryProvider;

  public DownloadViewModel_Factory(Provider<UnSplashPhotoRepository> photoRepositoryProvider) {
    this.photoRepositoryProvider = photoRepositoryProvider;
  }

  @Override
  public DownloadViewModel get() {
    return newInstance(photoRepositoryProvider.get());
  }

  public static DownloadViewModel_Factory create(
      Provider<UnSplashPhotoRepository> photoRepositoryProvider) {
    return new DownloadViewModel_Factory(photoRepositoryProvider);
  }

  public static DownloadViewModel newInstance(UnSplashPhotoRepository photoRepository) {
    return new DownloadViewModel(photoRepository);
  }
}
