package com.android.hilt

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.android.hilt.Fragment.ThirdActivity
import com.android.hilt.databinding.ActivityFirstBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class FirstActivity : AppCompatActivity() {
    lateinit var mViewBinding: ActivityFirstBinding

    @Inject
    lateinit var mStudent1: Student

    @Inject
    lateinit var mStudent2: Student

    @Inject
    lateinit var mTeacher: Teacher

    @Named("SpStorage")
    @Inject
    lateinit var mStorage1: IStorage

    @Named("SpStorage")
    @Inject
    lateinit var mStorage3: IStorage

    @Named("DbStorage")
    @Inject
    lateinit var mStorage2: IStorage

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(mViewBinding.root)
        mViewBinding.btn1.setOnClickListener(View.OnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        })

        mViewBinding.btn2.setOnClickListener {
            var intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

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

        mStorage3.save()
        mStorage3.get("name")

        mViewBinding.tvInfo1.append("\n------------")
        mViewBinding.tvInfo1.append("\nmStorage3:$mStorage3")
    }


}