package com.android.dagger_api;

import javax.inject.Inject;

public class Book {
    private String name;
    private String teacher;

    @Inject
    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "hashCode:" + hashCode() + "  Book{" +
                "name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
