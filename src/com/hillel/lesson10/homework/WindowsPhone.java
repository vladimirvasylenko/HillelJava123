package com.hillel.lesson10.homework;

public final class WindowsPhone extends Smartphone{

    private String model;
    private int storage;

    public WindowsPhone(String brand, int yearOfIssue, String operationSystem, String color, String model, int storage) {
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
    public void call() {
        super.call();
    }

    @Override
    public void goingToInternet() {
        super.goingToInternet();
    }

    public void callingSkype(){
        System.out.println("calling Skype");
    }

    @Override
    public void startApp() {
        System.out.println("WindowsPhone is stared App");
    }

    @Override
    public void closeApp() {
        System.out.println("WindowsPhone is closed App");
    }

    @Override
    public void sendTelegramMessage() {
        System.out.println("WindowsPhone is send message");
    }

    @Override
    public void readTelegramMessage() {
        System.out.println("WindowsPhone is reading message");
    }

    @Override
    public String toString() {
        return "WindowsPhone{" +
                "brand='" + getBrand() + '\'' +
                ", yearOfIssue='" + getYearOfIssue() + '\'' +
                ", operationSystem='" + getOperationSystem() + '\'' +
                ", color='" + getColor() + '\'' +
                "model='" + model + '\'' +
                ", storage=" + storage +
                '}';
    }
}
