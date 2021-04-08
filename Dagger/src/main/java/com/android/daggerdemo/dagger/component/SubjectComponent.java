package com.android.daggerdemo.dagger.component;

import com.android.daggerdemo.SecondActivity;
import com.android.daggerdemo.dagger.Subject;
import com.android.daggerdemo.dagger.module.SubjectModule;
import com.android.daggerdemo.dagger.scope.SubjectScope;

import dagger.Component;

@SubjectScope
@Component(dependencies = {StudentComponent.class}, modules = {SubjectModule.class})
public interface SubjectComponent {
    ComplexSubjectComponent.Builder getComplexSubjectComponent();//这一句一定要写，否则无效

    BasicSubjectComponent addSub();
//    BasicSubjectComponent addSub(BasicSubjectModule basicSubjectModule);

    Subject getSubject();

    void inject(SecondActivity secondActivity);
}
