package com.android.daggerdemo.module;

import com.android.daggerdemo.BasicSubject;

import dagger.Module;

@Module
public class BasicSubjectModule {
//    @Provides
    BasicSubject getBasicSubject() {
        return new BasicSubject("语文");
    }
}
