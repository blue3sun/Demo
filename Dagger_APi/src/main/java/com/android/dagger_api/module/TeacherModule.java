package com.android.dagger_api.module;


import com.android.dagger_api.Teacher;

import dagger.Module;
import dagger.Provides;

@Module
public class TeacherModule {
    @Provides
    Teacher getTeacher(){
        return new Teacher();
    }

}
