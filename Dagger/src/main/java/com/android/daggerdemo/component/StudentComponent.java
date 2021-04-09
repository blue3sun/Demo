package com.android.daggerdemo.component;

import com.android.daggerdemo.Grade;
import com.android.daggerdemo.MainActivity;
import com.android.daggerdemo.Student;
import com.android.daggerdemo.module.StudentModule;
import com.android.daggerdemo.qualifier.DevQualifier;
import com.android.daggerdemo.qualifier.TestQualifier;
import com.android.daggerdemo.scope.StudentScope;

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
