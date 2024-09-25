package vn.tapbi.arteditor.di;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import vn.tapbi.arteditor.data.local.db.TapbiDb;

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
public final class AppModule_ProvideRoomDbPhotoFactory implements Factory<TapbiDb> {
  private final AppModule module;

  private final Provider<Application> contextProvider;

  public AppModule_ProvideRoomDbPhotoFactory(AppModule module,
      Provider<Application> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public TapbiDb get() {
    return provideRoomDbPhoto(module, contextProvider.get());
  }

  public static AppModule_ProvideRoomDbPhotoFactory create(AppModule module,
      Provider<Application> contextProvider) {
    return new AppModule_ProvideRoomDbPhotoFactory(module, contextProvider);
  }

  public static TapbiDb provideRoomDbPhoto(AppModule instance, Application context) {
    return Preconditions.checkNotNullFromProvides(instance.provideRoomDbPhoto(context));
  }
}
