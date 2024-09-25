package vn.tapbi.arteditor.di;

import android.app.Application;
import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class AppModule_ProvideSharedFactory implements Factory<SharedPreferences> {
  private final AppModule module;

  private final Provider<Application> contextProvider;

  public AppModule_ProvideSharedFactory(AppModule module, Provider<Application> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideShared(module, contextProvider.get());
  }

  public static AppModule_ProvideSharedFactory create(AppModule module,
      Provider<Application> contextProvider) {
    return new AppModule_ProvideSharedFactory(module, contextProvider);
  }

  public static SharedPreferences provideShared(AppModule instance, Application context) {
    return Preconditions.checkNotNullFromProvides(instance.provideShared(context));
  }
}
