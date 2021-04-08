package com.android.dagger_android;

import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

public class AppApplication extends Application implements HasAndroidInjector {
    @Inject
    DispatchingAndroidInjector<Object> mDispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppApplicationComponent.create().inject(this);
    }

    @Override
    public AndroidInjector<Object> androidInjector() {
        return mDispatchingAndroidInjector;
    }
}
