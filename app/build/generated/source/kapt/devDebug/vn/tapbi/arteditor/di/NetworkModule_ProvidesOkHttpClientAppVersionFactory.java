package vn.tapbi.arteditor.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.Nullable;

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
public final class NetworkModule_ProvidesOkHttpClientAppVersionFactory implements Factory<OkHttpClient> {
  @Override
  @Nullable
  public OkHttpClient get() {
    return providesOkHttpClientAppVersion();
  }

  public static NetworkModule_ProvidesOkHttpClientAppVersionFactory create() {
    return InstanceHolder.INSTANCE;
  }

  @Nullable
  public static OkHttpClient providesOkHttpClientAppVersion() {
    return NetworkModule.INSTANCE.providesOkHttpClientAppVersion();
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvidesOkHttpClientAppVersionFactory INSTANCE = new NetworkModule_ProvidesOkHttpClientAppVersionFactory();
  }
}
