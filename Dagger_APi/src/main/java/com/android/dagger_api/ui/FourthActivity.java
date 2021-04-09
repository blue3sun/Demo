package com.android.dagger_api.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.android.dagger_api.Book;
import com.android.dagger_api.component.DaggerBookComponent;
import com.android.dagger_api.databinding.ActivityMainSimpleBinding;

import javax.inject.Inject;
import javax.inject.Named;

public class FourthActivity extends AppCompatActivity {
    private ActivityMainSimpleBinding mViewBinding;

    @Inject
    Book mBook;

//    @DevQualifier
    @Named("Dev")
    @Inject
    Book mDevBook;

//    @TestQualifier
    @Named("Test")
    @Inject
    Book mTestBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mViewBinding = ActivityMainSimpleBinding.inflate(getLayoutInflater());
        setContentView(mViewBinding.getRoot());

        DaggerBookComponent.create().inject(this);

        mViewBinding.tv1.setText("\n mBook:" + mBook.toString());
        mViewBinding.tv1.append("\n mDevBook:" + mDevBook.toString());
        mViewBinding.tv1.append("\n mTestBook:" + mTestBook.toString());
    }

}