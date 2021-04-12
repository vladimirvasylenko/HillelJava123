package com.hillel.lesson10.homework;

public abstract class Phone {

    private String brand;
    private int yearOfIssue;

    public Phone(String brand, int yearOfIssue) {
        this.brand = brand;
        this.yearOfIssue = yearOfIssue;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public void call() {
        System.out.println("phone is calling");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}

