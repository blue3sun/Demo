package com.android.daggerdemo.dagger.module;

import com.android.daggerdemo.dagger.Grade;
import com.android.daggerdemo.dagger.Student;
import com.android.daggerdemo.dagger.qualifier.DevQualifier;
import com.android.daggerdemo.dagger.qualifier.TestQualifier;
import com.android.daggerdemo.dagger.scope.StudentScope;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
@Module
public class StudentModule {

//    private Application mApplication;
//
//    private StudentModule(Application application){//如果是有参构造方法，则生成的DaggerStudentComponent就不会有create()方法了（new Builder().build()），即要自己设置StudentModule的实例才可以。
//        this.mApplication = application;
//    }

    @DevQualifier
//    @Named("dev")
    @Singleton
    @Provides
    Student getStudentDev(){
        return new Student("create by module dev");
    }

    @TestQualifier
//    @Named("test")
    @Singleton
    @Provides
    Student getStudentTest(){
        return new Student("create by module test");
    }

    @StudentScope
    @Provides
    Grade getGrade(){
        return new Grade();
    }

}
