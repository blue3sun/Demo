package com.android.daggerdemo.dagger;

import javax.inject.Inject;

public class Subject {
    private String name;
    private int studentCount;

    @Inject
    public Subject() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    @Override
    public String toString() {
        return "hashCode:" + hashCode() + "  Subject{" +
                "name='" + name + '\'' +
                ", studentCount=" + studentCount +
                '}';
    }
}
