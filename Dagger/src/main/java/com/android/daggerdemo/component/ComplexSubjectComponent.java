package com.android.daggerdemo.component;

import com.android.daggerdemo.ComplexSubject;

import dagger.Subcomponent;

@Subcomponent
public interface ComplexSubjectComponent {
    ComplexSubject getComplexSubject();

    @Subcomponent.Builder
    interface Builder {
        ComplexSubjectComponent build();
    }

}
