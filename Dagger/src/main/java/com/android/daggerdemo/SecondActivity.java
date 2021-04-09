package com.android.daggerdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.android.daggerdemo.component.DaggerStudentComponent;
import com.android.daggerdemo.component.DaggerSubjectComponent;
import com.android.daggerdemo.databinding.ActivityMainBinding;
import com.android.daggerdemo.module.StudentModule;
import com.android.daggerdemo.qualifier.DevQualifier;
import com.android.daggerdemo.qualifier.TestQualifier;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {
    private ActivityMainBinding mViewBinding;

    @Inject
    Subject mSubject;

    @DevQualifier
//    @Named("dev")
    @Inject
    Student mStudent1;

    @DevQualifier
//    @Named("dev")
    @Inject
    Student mStudent2;

    @TestQualifier
//    @Named("test")
    @Inject
    Student mStudent3;

    @Inject
    Grade mGrade;

    @Inject
    BasicSubject mBasicSubject;

    @Inject
    ComplexSubject mComplexSubject;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mViewBinding.getRoot());
        DaggerSubjectComponent.builder().studentComponent(DaggerStudentComponent.create()).build().inject(this);
        mViewBinding.tv1.setText("mSubject:"+mSubject.toString());
        mStudent1 = DaggerStudentComponent.create().getStudent();
        mStudent3 = DaggerStudentComponent.create().getStudent();
        mViewBinding.tv1.append("\n mStudent1:" +mStudent1.toString());
        mViewBinding.tv1.append("\n mStudent3:" + mStudent3.toString());
        mViewBinding.tv1.append("\n===================");
        mViewBinding.tv1.append("\n mStudent1:" + mStudent1.toString());
        mViewBinding.tv1.append("\n mStudent2:" + mStudent2.toString());
        mViewBinding.tv1.append("\n mStudent3:" + mStudent3.toString());

        mStudent1 = DaggerStudentComponent.builder().studentModule(new StudentModule()).build().getStudent();
        mViewBinding.tv1.append("\n mStudent1:" + mStudent1.toString());

        DaggerSubjectComponent.builder().studentComponent(DaggerStudentComponent.create()).build().addSub().getBasicSubject();
        DaggerSubjectComponent.builder().studentComponent(DaggerStudentComponent.create()).build().getComplexSubjectComponent().build().getComplexSubject();

        mViewBinding.tv1.append("\n mBasicSubject:" + mBasicSubject.toString());
        mViewBinding.tv1.append("\n mComplexSubject:" + mComplexSubject.toString());
    }
}