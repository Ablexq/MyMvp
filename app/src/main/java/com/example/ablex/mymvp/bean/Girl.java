package com.example.ablex.mymvp.bean;

public class Girl {

    private String name;
    private int drawable;

    public Girl(int id, String name) {
        this.drawable = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return drawable;
    }

    public void setImageId(int imageId) {
        this.drawable = imageId;
    }
}