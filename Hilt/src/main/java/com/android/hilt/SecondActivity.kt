package com.android.hilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.hilt.databinding.ActivityFirstBinding
import com.android.hilt.databinding.ActivitySecondBinding
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(mViewBinding.root)

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

}