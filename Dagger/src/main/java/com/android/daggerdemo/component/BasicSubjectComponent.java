package com.android.daggerdemo.component;

import com.android.daggerdemo.BasicSubject;

import dagger.Subcomponent;

@Subcomponent
public interface BasicSubjectComponent {
    BasicSubject getBasicSubject();

//    void inject(SecondActivity secondActivity);
}
