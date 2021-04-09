package com.android.dagger_api;

public class PlayGround {
    public float size;

    public PlayGround() {
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "hashCode:" + hashCode() + "  PlayGround{" +
                "size=" + size +
                '}';
    }
}
