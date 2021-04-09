package com.android.daggerdemo.module;


import com.android.daggerdemo.Subject;
import com.android.daggerdemo.component.ComplexSubjectComponent;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {ComplexSubjectComponent.class})
public class SubjectModule {
    @Provides
    Subject getSubject(){
        return new Subject();
    }

}
