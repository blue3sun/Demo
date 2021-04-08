package com.android.dagger_android.fragment;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {FragmentAModule.class})
public interface ThirdActivitySubComponent extends AndroidInjector<ThirdActivity>{
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<ThirdActivity> {
    }

}
