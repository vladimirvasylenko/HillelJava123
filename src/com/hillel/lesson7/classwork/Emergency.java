package com.hillel.lesson7.classwork;

import java.util.Random;

public class Emergency {

    private String emergencyServiceName;

    private int availableResource;

    public Emergency(String emergencyServiceName, int availableResource) {
        this.emergencyServiceName = emergencyServiceName;
        this.availableResource = availableResource;
    }

    public String getEmergencyServiceName() {
        return emergencyServiceName;
    }

    public void setEmergencyServiceName(String emergencyServiceName) {
        this.emergencyServiceName = emergencyServiceName;
    }

    public int getAvailableResource() {
        return availableResource;
    }

    public void setAvailableResource(int availableResource) {
        this.availableResource = availableResource;
    }

    public void checkIsHumanAliveAndCure(Human human) {
        System.out.println("start checking is human alived: ".concat(human.getName()));

        int humanHealth = human.getHealth();

        if (humanHealth < 1) {
            System.out.println("Human ".concat(human.getName()).concat(" is dead"));
            callEmergency(human);
        } else {
            System.out.println("check status alived");
        }
    }

    private void callEmergency(Human human) {
        System.out.println("starting emergency service for ".concat(human.getName()));

        int healthUp = getRandomInt(1, 100);
        human.setHealth(healthUp);

        System.out.println(human.getName().concat(" is saved!!! Health now :" + healthUp));
    }

    private static int getRandomInt(int min, int max) {
        Random randomHealthDamage = new Random();
        return randomHealthDamage.ints(min, max)
                .findFirst()
                .getAsInt();
    }

    @Override
    public String toString() {
        return "Emergency{" +
                "emergencyServiceName='" + emergencyServiceName + '\'' +
                ", availableResource=" + availableResource +
                '}';
    }
}
