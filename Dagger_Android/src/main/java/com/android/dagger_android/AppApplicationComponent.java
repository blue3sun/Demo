package com.android.dagger_android;

import com.android.dagger_android.fragment.ThridActivityModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AndroidInjectionModule.class, FirstActivityModule.class,
        SecondActivityModule.class, ThridActivityModule.class})
public interface AppApplicationComponent {
    void inject(AppApplication application);
}
