package com.android.hilt.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.android.hilt.R
import com.android.hilt.databinding.ActivityThirdBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ThirdActivity : AppCompatActivity() {
    lateinit var mViewBinding: ActivityThirdBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mViewBinding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(mViewBinding.root)

        supportFragmentManager.beginTransaction().add(R.id.fl,FragmentA()).commit()
    }
}