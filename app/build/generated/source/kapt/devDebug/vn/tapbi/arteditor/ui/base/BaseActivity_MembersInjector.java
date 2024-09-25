package vn.tapbi.arteditor.ui.base;

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
public final class BaseActivity_MembersInjector implements MembersInjector<BaseActivity> {
  private final Provider<SharedPreferenceHelper> mPrefHelperProvider;

  public BaseActivity_MembersInjector(Provider<SharedPreferenceHelper> mPrefHelperProvider) {
    this.mPrefHelperProvider = mPrefHelperProvider;
  }

  public static MembersInjector<BaseActivity> create(
      Provider<SharedPreferenceHelper> mPrefHelperProvider) {
    return new BaseActivity_MembersInjector(mPrefHelperProvider);
  }

  @Override
  public void injectMembers(BaseActivity instance) {
    injectMPrefHelper(instance, mPrefHelperProvider.get());
  }

  @InjectedFieldSignature("vn.tapbi.arteditor.ui.base.BaseActivity.mPrefHelper")
  public static void injectMPrefHelper(BaseActivity instance, SharedPreferenceHelper mPrefHelper) {
    instance.mPrefHelper = mPrefHelper;
  }
}
