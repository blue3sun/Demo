package com.android.dagger_api.component;

import com.android.dagger_api.module.TeachModule;
import com.android.dagger_api.ui.FifthActivity;

import dagger.Component;

@Component(modules = {TeachModule.class})
public interface TeachComponent {
    void inject(FifthActivity fifthActivity);

}
