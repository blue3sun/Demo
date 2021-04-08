package com.android.dagger_android;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {FirstActivitySubComponent.class})
public abstract class FirstActivityModule {
    @Binds
    @IntoMap
    @ClassKey(FirstActivity.class)
    abstract AndroidInjector.Factory<?> bind(FirstActivitySubComponent.Factory factory);//返回值需要带？

}
