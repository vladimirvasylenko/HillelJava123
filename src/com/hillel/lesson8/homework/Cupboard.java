package com.hillel.lesson8.homework;

public class Cupboard {

    private String brand;
    private String color;
    private int size;

    public Cupboard(String brand, String color, int size) {
        this.brand = brand;
        this.color = color;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand() {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor() {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize() {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Cupboard{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
