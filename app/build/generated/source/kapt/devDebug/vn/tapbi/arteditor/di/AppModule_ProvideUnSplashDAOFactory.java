package vn.tapbi.arteditor.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import vn.tapbi.arteditor.data.local.db.TapbiDb;
import vn.tapbi.arteditor.data.local.db.UnSplashDao;

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
public final class AppModule_ProvideUnSplashDAOFactory implements Factory<UnSplashDao> {
  private final AppModule module;

  private final Provider<TapbiDb> dbProvider;

  public AppModule_ProvideUnSplashDAOFactory(AppModule module, Provider<TapbiDb> dbProvider) {
    this.module = module;
    this.dbProvider = dbProvider;
  }

  @Override
  public UnSplashDao get() {
    return provideUnSplashDAO(module, dbProvider.get());
  }

  public static AppModule_ProvideUnSplashDAOFactory create(AppModule module,
      Provider<TapbiDb> dbProvider) {
    return new AppModule_ProvideUnSplashDAOFactory(module, dbProvider);
  }

  public static UnSplashDao provideUnSplashDAO(AppModule instance, TapbiDb db) {
    return Preconditions.checkNotNullFromProvides(instance.provideUnSplashDAO(db));
  }
}
