package com.android.daggerdemo.dagger.component;

import com.android.daggerdemo.MainActivity;
import com.android.daggerdemo.dagger.Grade;
import com.android.daggerdemo.dagger.Student;
import com.android.daggerdemo.dagger.module.StudentModule;
import com.android.daggerdemo.dagger.qualifier.DevQualifier;
import com.android.daggerdemo.dagger.qualifier.TestQualifier;
import com.android.daggerdemo.dagger.scope.StudentScope;

import javax.inject.Singleton;

import dagger.Component;

@StudentScope
@Singleton
// @Component
@Component(modules = {StudentModule.class})
public interface StudentComponent {
    Student getStudent();

    @DevQualifier
//    @Named("dev")
    Student getStudentDev();

    @TestQualifier
//    @Named("test")
    Student getStudentTest();

    Grade getGrade();

    void inject(MainActivity mainActivity);

}
