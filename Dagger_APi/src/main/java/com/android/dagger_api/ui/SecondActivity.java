package com.android.dagger_api.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.android.dagger_api.BasicSubject;
import com.android.dagger_api.School;
import com.android.dagger_api.component.DaggerSchoolComponent;
import com.android.dagger_api.component.DaggerSubjectComponent;
import com.android.dagger_api.component.SubjectComponent;
import com.android.dagger_api.databinding.ActivityMainSimpleBinding;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {
    private ActivityMainSimpleBinding mViewBinding;

    @Inject
    School mSchool;

    @Inject
    BasicSubject mBasicSubject;

//    @Inject
//    ComplexSubject mComplexSubject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewBinding = ActivityMainSimpleBinding.inflate(getLayoutInflater());
        setContentView(mViewBinding.getRoot());


        SubjectComponent subjectComponent = DaggerSubjectComponent.create();
        DaggerSchoolComponent.builder().subjectComponent(subjectComponent).build().inject(this);

        mViewBinding.tv1.setText("\n mSchool:" + mSchool.toString());
        mViewBinding.tv1.append("\n mBasicSubject:" + mBasicSubject.toString());
//        mViewBinding.tv1.append("\n mComplexSubject:" + mComplexSubject.toString());

    }
}