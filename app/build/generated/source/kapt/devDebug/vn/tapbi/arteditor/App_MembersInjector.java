package vn.tapbi.arteditor;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import vn.tapbi.arteditor.data.local.SharedPreferenceHelper;

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
public final class App_MembersInjector implements MembersInjector<App> {
  private final Provider<SharedPreferenceHelper> mPrefHelperProvider;

  public App_MembersInjector(Provider<SharedPreferenceHelper> mPrefHelperProvider) {
    this.mPrefHelperProvider = mPrefHelperProvider;
  }

  public static MembersInjector<App> create(Provider<SharedPreferenceHelper> mPrefHelperProvider) {
    return new App_MembersInjector(mPrefHelperProvider);
  }

  @Override
  public void injectMembers(App instance) {
    injectMPrefHelper(instance, mPrefHelperProvider.get());
  }

  @InjectedFieldSignature("vn.tapbi.arteditor.App.mPrefHelper")
  public static void injectMPrefHelper(App instance, SharedPreferenceHelper mPrefHelper) {
    instance.mPrefHelper = mPrefHelper;
  }
}
