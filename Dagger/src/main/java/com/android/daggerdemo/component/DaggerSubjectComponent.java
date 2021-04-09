// Generated by Dagger (https://dagger.dev).
package com.android.daggerdemo.component;

import com.android.daggerdemo.BasicSubject;
import com.android.daggerdemo.ComplexSubject;
import com.android.daggerdemo.SecondActivity;
import com.android.daggerdemo.Subject;
import com.android.daggerdemo.complex.SecondActivity_MembersInjector;
import com.android.daggerdemo.module.SubjectModule;

import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerSubjectComponent implements SubjectComponent {
  private final SubjectModule subjectModule;

  private final StudentComponent studentComponent;

  private DaggerSubjectComponent(SubjectModule subjectModuleParam,
      StudentComponent studentComponentParam) {
    this.subjectModule = subjectModuleParam;
    this.studentComponent = studentComponentParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public ComplexSubjectComponent.Builder getComplexSubjectComponent() {
    return new ComplexSubjectComponentBuilder();
  }

  @Override
  public Subject getSubject() {
    return SubjectModule_GetSubjectFactory.getSubject(subjectModule);
  }

  @Override
  public void inject(SecondActivity secondActivity) {
    injectSecondActivity(secondActivity);
  }

  @Override
  public BasicSubjectComponent addSub() {
    return new BasicSubjectComponentImpl();
  }

  private SecondActivity injectSecondActivity(SecondActivity instance) {
    SecondActivity_MembersInjector.injectMSubject(instance, SubjectModule_GetSubjectFactory.getSubject(subjectModule));
    SecondActivity_MembersInjector.injectMStudent1(instance, Preconditions.checkNotNullFromComponent(studentComponent.getStudentDev()));
    SecondActivity_MembersInjector.injectMStudent2(instance, Preconditions.checkNotNullFromComponent(studentComponent.getStudentDev()));
    SecondActivity_MembersInjector.injectMStudent3(instance, Preconditions.checkNotNullFromComponent(studentComponent.getStudentTest()));
    SecondActivity_MembersInjector.injectMGrade(instance, Preconditions.checkNotNullFromComponent(studentComponent.getGrade()));
    SecondActivity_MembersInjector.injectMBasicSubject(instance, new BasicSubject());
    SecondActivity_MembersInjector.injectMComplexSubject(instance, new ComplexSubject());
    return instance;
  }

  public static final class Builder {
    private SubjectModule subjectModule;

    private StudentComponent studentComponent;

    private Builder() {
    }

    public Builder subjectModule(SubjectModule subjectModule) {
      this.subjectModule = Preconditions.checkNotNull(subjectModule);
      return this;
    }

    public Builder studentComponent(StudentComponent studentComponent) {
      this.studentComponent = Preconditions.checkNotNull(studentComponent);
      return this;
    }

    public SubjectComponent build() {
      if (subjectModule == null) {
        this.subjectModule = new SubjectModule();
      }
      Preconditions.checkBuilderRequirement(studentComponent, StudentComponent.class);
      return new DaggerSubjectComponent(subjectModule, studentComponent);
    }
  }

  private final class ComplexSubjectComponentBuilder implements ComplexSubjectComponent.Builder {
    @Override
    public ComplexSubjectComponent build() {
      return new ComplexSubjectComponentImpl();
    }
  }

  private final class ComplexSubjectComponentImpl implements ComplexSubjectComponent {
    private ComplexSubjectComponentImpl() {

    }

    @Override
    public ComplexSubject getComplexSubject() {
      return new ComplexSubject();
    }
  }

  private final class BasicSubjectComponentImpl implements BasicSubjectComponent {
    private BasicSubjectComponentImpl() {

    }

    @Override
    public BasicSubject getBasicSubject() {
      return new BasicSubject();
    }
  }
}
