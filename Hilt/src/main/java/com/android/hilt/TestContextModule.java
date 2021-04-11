package com.android.hilt;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;
import dagger.hilt.android.qualifiers.ActivityContext;
import dagger.hilt.android.qualifiers.ApplicationContext;

@Module
@InstallIn(ActivityComponent.class)
class TestContextModule {
    @Provides
    Dialog getDialog(@ActivityContext Context activityContext){
        AlertDialog.Builder builder = new AlertDialog.Builder(activityContext)
                .setTitle("对话框")
                .setMessage("测试ActivityContext:"+activityContext.getClass().getSimpleName())
                .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
        AlertDialog alertDialog = builder.create();
        return alertDialog;
    }

    @Provides
    AppApplication getApplication(@ApplicationContext Context applicationContext){
        return (AppApplication) applicationContext;
    }

}
