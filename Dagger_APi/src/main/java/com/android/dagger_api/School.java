package com.android.dagger_api;

import javax.inject.Inject;

public class School {
    private String name;
    private int studentCount;

    @Inject
    public School() {
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
        return "hashCode:" + hashCode() + "  School{" +
                "name='" + name + '\'' +
                ", studentCount=" + studentCount +
                '}';
    }
}
