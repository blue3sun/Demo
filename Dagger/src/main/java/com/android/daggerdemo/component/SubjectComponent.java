package com.android.daggerdemo.component;

import com.android.daggerdemo.SecondActivity;
import com.android.daggerdemo.Subject;
import com.android.daggerdemo.module.SubjectModule;
import com.android.daggerdemo.scope.SubjectScope;

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
