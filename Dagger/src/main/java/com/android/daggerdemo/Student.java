package com.android.daggerdemo;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Student {
    private String name;
    private String age;
    private String grade;
    @Inject
    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "hashCode:" + hashCode() + "  Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
