package com.sreekanth.assetmanager;

public class ItemBean {
    int image,count;
    String name, year;

    public ItemBean(int image, int count, String name, String year) {
        this.image = image;
        this.count = count;
        this.name = name;
        this.year = year;
    }

    public ItemBean() {
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
