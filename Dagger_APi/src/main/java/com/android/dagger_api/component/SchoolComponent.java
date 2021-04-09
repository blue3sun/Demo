package com.android.dagger_api.component;


import com.android.dagger_api.School;
import com.android.dagger_api.ui.SecondActivity;

import dagger.Component;

@Component(dependencies = {SubjectComponent.class})
public interface SchoolComponent {

    School getSchool();

    void inject(SecondActivity secondActivity);
}
