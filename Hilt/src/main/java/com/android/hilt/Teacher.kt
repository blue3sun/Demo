package com.android.hilt

import javax.inject.Inject

class Teacher @Inject constructor(var student1: Student) {
    @Inject
    lateinit var student2: Student
    var name: String? = ""
    var studentCount: Int? = 0

    override fun toString(): String {
        return "hashCode:" + hashCode() + "  Teacher(name=$name, studentCount=$studentCount,student1=$student1,student2=$student2)"
    }

}