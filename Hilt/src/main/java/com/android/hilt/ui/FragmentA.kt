package com.android.hilt.ui

import android.app.Application
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.android.hilt.IStorage
import com.android.hilt.Student
import com.android.hilt.Teacher
import com.android.hilt.databinding.FragmentABinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class FragmentA : Fragment() {
    private var mViewBinding: FragmentABinding? = null

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
    lateinit var mStorage2: IStorage

    @Named("DbStorage")
    @Inject
    lateinit var mStorage3: IStorage

    @Inject
    lateinit var mDialog: Dialog

    @Inject
    lateinit var mApplicationContext: Application

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mViewBinding = FragmentABinding.inflate(layoutInflater, container, false)
        initView()
        return mViewBinding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mViewBinding?.tvInfo1?.text = "mStudent1:$mStudent1"

        mViewBinding?.tvInfo1?.append("\n------------")
        mViewBinding?.tvInfo1?.append("\nmStudent2:$mStudent2")

        mViewBinding?.tvInfo1?.append("\n------------")
        mViewBinding?.tvInfo1?.append("\nmTeacher: $mTeacher")

        mStorage1.save()
        mStorage1.get("name")

        mViewBinding?.tvInfo1?.append("\n------------")
        mViewBinding?.tvInfo1?.append("\nmStorage1:$mStorage1")

        mStorage2.save()
        mStorage2.get("name")

        mViewBinding?.tvInfo1?.append("\n------------")
        mViewBinding?.tvInfo1?.append("\nmStorage2:$mStorage2")

        mStorage3.save()
        mStorage3.get("name")

        mViewBinding?.tvInfo1?.append("\n------------")
        mViewBinding?.tvInfo1?.append("\nmStorage3:$mStorage3")


        mViewBinding?.tvInfo1?.append("\n------------")
        mViewBinding?.tvInfo1?.append("\nmDialog:$mDialog")

        mViewBinding?.tvInfo1?.append("\n------------")
        mViewBinding?.tvInfo1?.append("\nmApplicationContext:$mApplicationContext")

        mViewBinding?.tvInfo1?.append("\napplication==mApplicationContext:"+(requireActivity().application==mApplicationContext))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        mViewBinding = null
    }

    private fun initView() {
        mViewBinding?.btn1?.setOnClickListener {
            mDialog.show()
        }
    }

}