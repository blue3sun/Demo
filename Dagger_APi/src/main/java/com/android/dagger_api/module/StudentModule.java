package com.android.dagger_api.module;


import com.android.dagger_api.Student;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule {
    @Singleton
    @Provides
    Student getStudent(){
        return new Student("create by module test");
    }

}
