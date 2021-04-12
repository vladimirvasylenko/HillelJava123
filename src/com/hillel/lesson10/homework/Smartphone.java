package com.hillel.lesson10.homework;

public abstract class Smartphone extends Phone {

    private String operationSystem;
    private String color;

    public Smartphone(String brand, int yearOfIssue, String operationSystem, String color) {
        super(brand, yearOfIssue);
        this.operationSystem = operationSystem;
        this.color = color;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void call() {
        super.call();
    }

    public void goingToInternet() {
        System.out.println("https://www.google.com/");
    }

    @Override
    public String toString() {
        return super.toString() + "Smartphone{" +
                "operationSystem='" + operationSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

}
