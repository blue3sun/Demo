package com.android.dagger_api.component;

import com.android.dagger_api.module.PlaceModule;

import dagger.Component;

@Component(modules = {PlaceModule.class})
public interface PlaceComponent {
    SubSchoolComponent.Builder bindSubSchoolComponent();

}


//import com.android.dagger_api.module.PlaceModule;
//
//import dagger.Component;
//
//@Component(modules = {PlaceModule.class})
//public interface PlaceComponent {
//    SubSchoolComponent bindSubSchoolComponent();
//
//}
