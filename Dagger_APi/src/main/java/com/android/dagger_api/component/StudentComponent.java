package com.android.dagger_api.component;


import com.android.dagger_api.Student;
import com.android.dagger_api.module.StudentModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {StudentModule.class})
public interface StudentComponent {
    Student getStudent();
}
