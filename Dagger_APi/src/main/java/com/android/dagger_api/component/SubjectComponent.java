package com.android.dagger_api.component;

import com.android.dagger_api.BasicSubject;
import com.android.dagger_api.module.SubjectModule;

import dagger.Component;

@Component(modules = {SubjectModule.class})
public interface SubjectComponent {
    BasicSubject getBasicSubject();
}
