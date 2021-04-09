package com.android.dagger_api.component;

import com.android.dagger_api.ui.FourthActivity;
import com.android.dagger_api.module.BookModule;

import dagger.Component;

@Component(modules = {BookModule.class})
public interface BookComponent {

    void inject(FourthActivity fourthActivity);

}
