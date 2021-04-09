package com.android.dagger_api;

public class ClassRoom {
    private int floor;
    private float size;

    public ClassRoom() {
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "hashCode:" + hashCode() + "  ClassRoom{" +
                "floor=" + floor +
                ", size=" + size +
                '}';
    }
}
