package com.android.dagger_api.module;

import com.android.dagger_api.teach.MultiMediaTeach;

import dagger.Module;
import dagger.Provides;

@Module
public class MultiMediaTeachModel {

    @Provides
    static MultiMediaTeach getMultiMediaTeacher(){
        return new MultiMediaTeach();
    }
}
