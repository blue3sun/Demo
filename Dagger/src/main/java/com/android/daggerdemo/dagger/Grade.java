package com.android.daggerdemo.dagger;

import javax.inject.Inject;

public class Grade {
    private String name;
    private int count;

//    @Inject
//    public Grade() {
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "hashCode:" + hashCode() + "  Grade{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
