package com.android.dagger_api.module;

import com.android.dagger_api.BasicSubject;
import com.android.dagger_api.ComplexSubject;

import dagger.Module;
import dagger.Provides;

@Module
public class SubjectModule {
    @Provides
    BasicSubject getBasicSubject() {
        return new BasicSubject("语文");
    }

    @Provides
    ComplexSubject getComplexSubject() {
        return new ComplexSubject("化学");
    }

}
