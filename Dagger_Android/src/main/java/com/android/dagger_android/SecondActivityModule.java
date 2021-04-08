package com.android.dagger_android;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {SecondActivitySubComponent.class})
public abstract class SecondActivityModule {
    @Binds
    @IntoMap
    @ClassKey(SecondActivity.class)
    abstract AndroidInjector.Factory<?> bind(SecondActivitySubComponent.Factory factory);//返回值需要带？

}
