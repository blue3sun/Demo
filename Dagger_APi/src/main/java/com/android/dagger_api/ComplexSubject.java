
package com.android.dagger_api;

public class ComplexSubject {
    private String des;
    private String teacher;
    private int score;

//    @Inject
    public ComplexSubject() {
    }

    public ComplexSubject(String des) {
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "hashCode:" + hashCode() + "  ComplexSubject{" +
                "des='" + des + '\'' +
                ", teacher='" + teacher + '\'' +
                ", score=" + score +
                '}';
    }
}
