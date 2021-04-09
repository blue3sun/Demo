package com.android.dagger_api;

import javax.inject.Inject;

public class Teacher {
    String name;
    String subject;

    @Inject
    public Teacher() {
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "hashCode:" + hashCode() + "  Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
