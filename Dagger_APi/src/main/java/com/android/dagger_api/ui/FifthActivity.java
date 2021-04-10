package com.android.dagger_api.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.android.dagger_api.component.DaggerTeachComponent;
import com.android.dagger_api.databinding.ActivityMainSimpleBinding;
import com.android.dagger_api.teach.ITeach;

import javax.inject.Inject;

public class FifthActivity extends AppCompatActivity {
    private ActivityMainSimpleBinding mViewBinding;

    @Inject
    ITeach mTeach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewBinding = ActivityMainSimpleBinding.inflate(getLayoutInflater());
        setContentView(mViewBinding.getRoot());

        DaggerTeachComponent.create().inject(this);

        mViewBinding.tv1.setText(mTeach.teach());
    }

}