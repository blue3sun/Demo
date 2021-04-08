package com.android.daggerdemo.dagger.component;

import com.android.daggerdemo.dagger.ComplexSubject;

import dagger.Subcomponent;

@Subcomponent
public interface ComplexSubjectComponent {
    ComplexSubject getComplexSubject();

    @Subcomponent.Builder
    interface Builder {
        ComplexSubjectComponent build();
    }

}
