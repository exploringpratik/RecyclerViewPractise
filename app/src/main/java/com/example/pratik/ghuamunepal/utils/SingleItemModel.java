package com.example.pratik.ghuamunepal.utils;

public class SingleItemModel {
    private String name, address, info;
    private int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public SingleItemModel(String name, String address, String info, int image) {

        this.name = name;
        this.address = address;
        this.info = info;
        this.image = image;
    }
}