package com.android.dagger_android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.dagger_android.databinding.ActivityFirstBinding;
import com.android.dagger_android.fragment.ThirdActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class FirstActivity extends AppCompatActivity {
    private ActivityFirstBinding mViewBinding;
    @Inject
    Student mStudent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        mViewBinding = ActivityFirstBinding.inflate(getLayoutInflater());
        setContentView(mViewBinding.getRoot());
        mViewBinding.tvInfo1.setText(mStudent.toString());
        mViewBinding.btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        mViewBinding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}
