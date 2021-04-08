package com.android.dagger_android;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {StudentModule.class})
public interface SecondActivitySubComponent extends AndroidInjector<SecondActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SecondActivity> {

    }

}
