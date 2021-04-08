package com.android.dagger_android.fragment;

import com.android.dagger_android.StudentModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {StudentModule.class})
public interface FragmentASubComponent extends AndroidInjector<FragmentA> {

    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<FragmentA> {

    }

}
