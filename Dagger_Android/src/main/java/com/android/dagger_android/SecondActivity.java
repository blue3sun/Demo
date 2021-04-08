package com.android.dagger_android;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.dagger_android.databinding.ActivitySecondBinding;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class SecondActivity extends AppCompatActivity {
    private ActivitySecondBinding mViewBinding;
    @Inject
    Student mStudent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        mViewBinding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(mViewBinding.getRoot());
        mViewBinding.tvInfo1.setText(mStudent.toString());
    }
}
