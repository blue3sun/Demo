package com.android.dagger_api.module;

import com.android.dagger_api.teach.ITeach;
import com.android.dagger_api.teach.MultiMediaTeach;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class TeachModule {
    @Binds
    abstract ITeach getTeach(MultiMediaTeach multiMediaTeach);

    @Provides
    static MultiMediaTeach getMultiMediaTeacher() {
        return new MultiMediaTeach();
    }

}

//import com.android.dagger_api.teach.ITeach;
//import com.android.dagger_api.teach.MultiMediaTeach;
//
//import dagger.Binds;
//import dagger.Module;
//
//@Module(includes = {MultiMediaTeachModel.class})
//public abstract class TeachModule {
//    @Binds
//    abstract ITeach getTeach(MultiMediaTeach multiMediaTeach);
//}

