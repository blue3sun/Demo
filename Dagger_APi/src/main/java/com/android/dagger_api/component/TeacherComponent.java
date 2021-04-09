package com.android.dagger_api.component;


import com.android.dagger_api.module.TeacherModule;

import dagger.Component;

@Component(modules = {TeacherModule.class})
public interface TeacherComponent {
//    Teacher getTeacher();
}
