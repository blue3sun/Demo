package com.android.dagger_api.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.android.dagger_api.ClassRoom;
import com.android.dagger_api.PlayGround;
import com.android.dagger_api.School;
import com.android.dagger_api.component.DaggerPlaceComponent;
import com.android.dagger_api.databinding.ActivityMainSimpleBinding;

import javax.inject.Inject;

public class ThirdActivity extends AppCompatActivity {
    private ActivityMainSimpleBinding mViewBinding;

    @Inject
    School mSchool;

    @Inject
    ClassRoom mClassRoom;

    @Inject
    PlayGround mPlayGround;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewBinding = ActivityMainSimpleBinding.inflate(getLayoutInflater());
        setContentView(mViewBinding.getRoot());

        DaggerPlaceComponent.create().bindSubSchoolComponent().build().inject(this);

//        DaggerPlaceComponent.create().bindSubSchoolComponent().inject(this);

        mViewBinding.tv1.setText("\n mClassRoom:" + mClassRoom.toString());
        mViewBinding.tv1.append("\n mPlayGround:" + mPlayGround.toString());
    }

}