package com.android.dagger_android.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.dagger_android.R;
import com.android.dagger_android.databinding.ActivityThirdBinding;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

public class ThirdActivity extends AppCompatActivity implements HasAndroidInjector {
    private ActivityThirdBinding mViewBinding;

    @Inject
    DispatchingAndroidInjector<Object> mDispatchingAndroidInjector;

    @Override
    protected
    void onCreate(@Nullable Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        mViewBinding = ActivityThirdBinding.inflate(getLayoutInflater());
        setContentView(mViewBinding.getRoot());
        getSupportFragmentManager().beginTransaction().add(R.id.fl,new FragmentA()).commit();
    }

    @Override
    public AndroidInjector<Object> androidInjector() {
        return mDispatchingAndroidInjector;
    }
}
