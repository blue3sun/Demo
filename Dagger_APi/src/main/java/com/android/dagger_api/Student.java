package com.android.dagger_api;

public class Student {
    private String name;
    private String age;
    private String grade;

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
