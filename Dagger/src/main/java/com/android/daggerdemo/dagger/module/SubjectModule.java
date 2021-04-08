package com.android.daggerdemo.dagger.module;


import com.android.daggerdemo.dagger.Subject;
import com.android.daggerdemo.dagger.component.ComplexSubjectComponent;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {ComplexSubjectComponent.class})
public class SubjectModule {
    @Provides
    Subject getSubject(){
        return new Subject();
    }

}
