package vn.tapbi.arteditor.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;
import vn.tapbi.arteditor.data.remote.UnsplashApi;

@ScopeMetadata("javax.inject.Singleton")
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
public final class NetworkModule_ProvidesUnsplashApiFactory implements Factory<UnsplashApi> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvidesUnsplashApiFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public UnsplashApi get() {
    return providesUnsplashApi(retrofitProvider.get());
  }

  public static NetworkModule_ProvidesUnsplashApiFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvidesUnsplashApiFactory(retrofitProvider);
  }

  public static UnsplashApi providesUnsplashApi(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providesUnsplashApi(retrofit));
  }
}
