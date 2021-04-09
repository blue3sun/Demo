package com.android.dagger_api.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.android.dagger_api.Student;
import com.android.dagger_api.component.DaggerStudentComponent;
import com.android.dagger_api.component.StudentComponent;
import com.android.dagger_api.databinding.ActivityMainSimpleBinding;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private ActivityMainSimpleBinding mViewBinding;

    @Inject
    Student mStudent1;

    @Inject
    Student mStudent2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewBinding = ActivityMainSimpleBinding.inflate(getLayoutInflater());
        setContentView(mViewBinding.getRoot());
        initView();

        mStudent1 = DaggerStudentComponent.create().getStudent();
        mStudent2 = DaggerStudentComponent.create().getStudent();

        mViewBinding.tv1.setText("\n mStudent1:" + mStudent1.toString());
        mViewBinding.tv1.append("\n mStudent2:" + mStudent2.toString());


        StudentComponent studentComponent = DaggerStudentComponent.create();
        mStudent1 = studentComponent.getStudent();
        mStudent2 = studentComponent.getStudent();

        mViewBinding.tv1.append("\n mStudent1:" + mStudent1.toString());
        mViewBinding.tv1.append("\n mStudent2:" + mStudent2.toString());
    }

    private void initView() {
        mViewBinding.btn1.setVisibility(View.VISIBLE);
        mViewBinding.btn2.setVisibility(View.VISIBLE);
        mViewBinding.btn3.setVisibility(View.VISIBLE);
        mViewBinding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        mViewBinding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
        mViewBinding.btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, FourthActivity.class);
                startActivity(intent);
            }
        });
    }
}