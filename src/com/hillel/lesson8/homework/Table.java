package com.hillel.lesson8.homework;

import java.util.Random;

public class Table {

    private String brand;
    private String color;
    private int size;

    public Table(String brand, String color, int size){
        this.brand = brand;
        this.color = color;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size>100){
            System.out.println("choose size fom 1 to 100");
            this.size = 0;
        }else if (size < 1){
            System.out.println("choose size fom 1 to 100");
            this.size = 0;
        } else {this.size = size;}

    }

    @Override
    public String toString() {
        return "Table{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
