package com.example.task_1;

public class MyListData {
    private String description;
    private String price;
    private int imgId;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public MyListData(String description, String price, int imgId) {
        this.description = description;
        this.price = price;
        this.imgId = imgId;


    }
}
