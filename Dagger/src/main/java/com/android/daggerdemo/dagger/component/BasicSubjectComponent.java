package com.android.daggerdemo.dagger.component;

import com.android.daggerdemo.dagger.BasicSubject;

import dagger.Subcomponent;

@Subcomponent
public interface BasicSubjectComponent {
    BasicSubject getBasicSubject();

//    void inject(SecondActivity secondActivity);
}
