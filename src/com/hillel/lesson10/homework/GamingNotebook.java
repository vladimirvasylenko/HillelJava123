package com.hillel.lesson10.homework;

public class GamingNotebook extends Notebook {

    private String model;
    private String GraphicCard;

    public GamingNotebook(String brand, int yearOfIssue, String operationSystem, String color, String model, String graphicCard) {
        super(brand, yearOfIssue, operationSystem, color);
        this.model = model;
        GraphicCard = graphicCard;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGraphicCard() {
        return GraphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        GraphicCard = graphicCard;
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void goingToInternet() {
        super.goingToInternet();
    }

    public void startingSkyrim() {
        System.out.println("starting Skyrim");
    }

    @Override
    public String toString() {
        return super.toString() +
                "GamingNotebook{" +
                "model='" + model + '\'' +
                ", GraphicCard='" + GraphicCard + '\'' +
                '}';
    }
}
