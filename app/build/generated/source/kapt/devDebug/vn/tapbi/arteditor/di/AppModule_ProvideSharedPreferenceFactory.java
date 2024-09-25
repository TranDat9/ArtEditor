package vn.tapbi.arteditor.di;

import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import vn.tapbi.arteditor.data.local.SharedPreferenceHelper;

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
public final class AppModule_ProvideSharedPreferenceFactory implements Factory<SharedPreferenceHelper> {
  private final AppModule module;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public AppModule_ProvideSharedPreferenceFactory(AppModule module,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    this.module = module;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public SharedPreferenceHelper get() {
    return provideSharedPreference(module, sharedPreferencesProvider.get());
  }

  public static AppModule_ProvideSharedPreferenceFactory create(AppModule module,
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new AppModule_ProvideSharedPreferenceFactory(module, sharedPreferencesProvider);
  }

  public static SharedPreferenceHelper provideSharedPreference(AppModule instance,
      SharedPreferences sharedPreferences) {
    return Preconditions.checkNotNullFromProvides(instance.provideSharedPreference(sharedPreferences));
  }
}
