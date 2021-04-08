package com.android.daggerdemo.dagger.module;

import com.android.daggerdemo.dagger.BasicSubject;

import dagger.Module;

@Module
public class BasicSubjectModule {
//    @Provides
    BasicSubject getBasicSubject() {
        return new BasicSubject("语文");
    }
}
