package com.android.dagger_android.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.android.dagger_android.Student;
import com.android.dagger_android.databinding.FragmentABinding;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

public class FragmentA extends Fragment {
    private FragmentABinding mViewBinding;

    @Inject
    Student mStudent;

    @Override
    public void onAttach(@NonNull Context context) {
//        AndroidInjection.inject(this);
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mViewBinding = FragmentABinding.inflate(inflater, container, false);
        return mViewBinding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewBinding.tvInfo1.setText(mStudent.toString());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mViewBinding = null;
    }
}
