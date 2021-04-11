package com.android.hilt

import android.app.Application
import android.app.Dialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.android.hilt.databinding.ActivityFirstBinding
import com.android.hilt.databinding.ActivitySecondBinding
import com.android.hilt.fragment.ThirdActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {
    lateinit var mViewBinding: ActivitySecondBinding

    @Inject
    lateinit var mStudent1: Student

    @Inject
    lateinit var mStudent2: Student

    @Inject
    lateinit var mTeacher: Teacher

    @Named("SpStorage")
    @Inject
    lateinit var mStorage1: IStorage

    @Named("DbStorage")
    @Inject
    lateinit var mStorage2: IStorage

    @Inject
    lateinit var mDialog: Dialog

    @Inject
    lateinit var mApplicationContext: Application

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(mViewBinding.root)
        initView()

        mViewBinding.tvInfo1.text = "mStudent1:$mStudent1"

        mViewBinding.tvInfo1.append("\n------------")
        mViewBinding.tvInfo1.append("\nmStudent2:$mStudent2")

        mViewBinding.tvInfo1.append("\n------------")
        mViewBinding.tvInfo1.append("\nmTeacher: $mTeacher")

        mStorage1.save()
        mStorage1.get("name")

        mViewBinding.tvInfo1.append("\n------------")
        mViewBinding.tvInfo1.append("\nmStorage1:$mStorage1")


        mStorage2.save()
        mStorage2.get("name")

        mViewBinding.tvInfo1.append("\n------------")
        mViewBinding.tvInfo1.append("\nmStorage2:$mStorage2")
    }

    private fun initView() {
        mViewBinding.btn1.setOnClickListener {
            mDialog.show()
        }
    }

}