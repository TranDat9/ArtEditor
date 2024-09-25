package vn.tapbi.arteditor.data.repository;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import vn.tapbi.arteditor.data.local.db.TapbiDb;
import vn.tapbi.arteditor.data.remote.UnsplashApi;

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
public final class UnSplashPhotoRepository_Factory implements Factory<UnSplashPhotoRepository> {
  private final Provider<UnsplashApi> unsplashApiProvider;

  private final Provider<TapbiDb> tapbiDbProvider;

  public UnSplashPhotoRepository_Factory(Provider<UnsplashApi> unsplashApiProvider,
      Provider<TapbiDb> tapbiDbProvider) {
    this.unsplashApiProvider = unsplashApiProvider;
    this.tapbiDbProvider = tapbiDbProvider;
  }

  @Override
  public UnSplashPhotoRepository get() {
    return newInstance(unsplashApiProvider.get(), tapbiDbProvider.get());
  }

  public static UnSplashPhotoRepository_Factory create(Provider<UnsplashApi> unsplashApiProvider,
      Provider<TapbiDb> tapbiDbProvider) {
    return new UnSplashPhotoRepository_Factory(unsplashApiProvider, tapbiDbProvider);
  }

  public static UnSplashPhotoRepository newInstance(UnsplashApi unsplashApi, TapbiDb tapbiDb) {
    return new UnSplashPhotoRepository(unsplashApi, tapbiDb);
  }
}
