package com.android.hilt

import javax.inject.Inject

public class Student @Inject constructor() {

    var name: String? = ""
    var age: Int? = 0

    override fun toString(): String {
        return "HashCode:" + hashCode() + "   Student(name=$name, age=$age)"
    }

}