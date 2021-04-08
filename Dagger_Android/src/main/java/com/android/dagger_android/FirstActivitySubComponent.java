package com.android.dagger_android;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {StudentModule.class})
public interface FirstActivitySubComponent extends AndroidInjector<FirstActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<FirstActivity> {
    }
}
