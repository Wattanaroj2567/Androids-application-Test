package com.example.recyclerview.model;

public class Product {

    // ประกาศตัวแปรของคลาส Product
    private String product_name; // ชื่อสินค้า
    private String product_image; // ภาพสินค้า
    private String product_price; // ราคาสินค้า

    // Getter สำหรับ product_image
    public String getProduct_image() {
        return product_image;
    }

    // Setter สำหรับ product_image
    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    // Getter สำหรับ product_name
    public String getProduct_name() {
        return product_name;
    }

    // Setter สำหรับ product_name
    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    // Getter สำหรับ product_price
    public String getProduct_price() {
        return product_price;
    }

    // Setter สำหรับ product_price
    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }

}
