package com.android.dagger_android.fragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = {FragmentASubComponent.class})
public abstract class FragmentAModule {
    @Binds
    @IntoMap
    @ClassKey(FragmentA.class)
    abstract AndroidInjector.Factory<?> bindFragmentA(FragmentASubComponent.Factory factory);

}
