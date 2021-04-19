package com.hillel.lesson10.homework;

public abstract class PersonalComputer implements IntellijIdea, Coding, Charging {

    private String brand;
    private int yearOfIssue;

    public PersonalComputer(String brand, int yearOfIssue) {
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

    public void start(){
        System.out.println("PC is starting");
    }

    @Override
    public String toString() {
        return "PersonalComputer{" +
                "brand='" + brand + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}

