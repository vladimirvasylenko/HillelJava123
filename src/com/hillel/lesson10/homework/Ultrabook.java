package com.hillel.lesson10.homework;

public class Ultrabook extends Notebook {

    private String model;
    private int storage;

    public Ultrabook(String brand, int yearOfIssue, String operationSystem, String color, String model, int storage) {
        super(brand, yearOfIssue, operationSystem, color);
        this.model = model;
        this.storage = storage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void goingToInternet() {
        super.goingToInternet();
    }

    public void callingSkype() {
        System.out.println("calling Skype");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Ultrabook{" +
                "model='" + model + '\'' +
                ", storage=" + storage +
                '}';
    }
}
