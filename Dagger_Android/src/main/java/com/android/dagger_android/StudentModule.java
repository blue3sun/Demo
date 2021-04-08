package com.android.dagger_android;

import dagger.Module;
import dagger.Provides;
@Module
public class StudentModule {
    @Provides
    Student getStudent(){
        return new Student("aaa",12);
    }

}
