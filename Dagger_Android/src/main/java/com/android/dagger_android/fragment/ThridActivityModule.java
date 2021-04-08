package com.android.dagger_android.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {ThirdActivitySubComponent.class})
public abstract class ThridActivityModule {
    @Binds
    @IntoMap
    @ClassKey(ThirdActivity.class)
    abstract AndroidInjector.Factory<?> bind(ThirdActivitySubComponent.Factory factory);
}
