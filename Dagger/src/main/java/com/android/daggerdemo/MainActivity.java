package com.android.daggerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.android.daggerdemo.dagger.Grade;
import com.android.daggerdemo.dagger.Student;
import com.android.daggerdemo.dagger.component.DaggerStudentComponent;
import com.android.daggerdemo.dagger.module.StudentModule;
import com.android.daggerdemo.dagger.qualifier.DevQualifier;
import com.android.daggerdemo.dagger.qualifier.TestQualifier;
import com.android.daggerdemo.databinding.ActivityMainBinding;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mViewBinding;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mViewBinding.getRoot());
        initView();
        mStudent1 = DaggerStudentComponent.create().getStudent();
        mStudent3 = DaggerStudentComponent.create().getStudent();
        mViewBinding.tv1.setText(mStudent1.toString());
        mViewBinding.tv1.append("\n" + mStudent3.toString());
        mViewBinding.tv1.append("\n===================");
        DaggerStudentComponent.create().inject(this);
        mViewBinding.tv1.append("\n" + mStudent1.toString());
        mViewBinding.tv1.append("\n" + mStudent3.toString());
        mViewBinding.tv1.append("\n" + mStudent2.toString());

        mStudent1 = DaggerStudentComponent.builder().studentModule(new StudentModule()).build().getStudent();
        mViewBinding.tv1.append("\n" + mStudent1.toString());

    }

    private void initView() {
        mViewBinding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });
    }
}