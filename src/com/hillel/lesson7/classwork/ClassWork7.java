package com.hillel.lesson7.classwork;

import java.util.Random;

public class ClassWork7 {

    static private int covidResearchIndex = 0;

    public static void main(String[] args) {

        Coronavirus covid = new Coronavirus("covid-21");

        Emergency hillell_emergency_service = new Emergency("hillell hillell_emergency_service service", 99);

        Scientist einstein = new Scientist("Einstein");

        Scientist esmeralda = new Scientist("Esmeralda");

        Scientist alfred = new Scientist("Alfred");

        Human dima = new Human("Dima", 38, "male", 100);
        System.out.println("dima object fields values is : " + dima.toString());

        Human vlad = new Human("Vlad", 29, "male", 100);
        System.out.println("vlad object fields values is : " + vlad.toString());

        Human katya = new Human("Katya", 18, "female", 100);
        System.out.println("katya object fields values is : " + katya.toString());

        System.out.println("FIRST WAVE OF CORONA");
        covid.attack(dima);
        covid.attack(vlad);
        covid.attack(katya);

//        coronaAttack(dima);
//        coronaAttack(vlad);
//        coronaAttack(katya);

        System.out.println("SECOND WAVE OF CORONA");
        covid.attack(dima);
        covid.attack(vlad);
        covid.attack(katya);

//        coronaAttack(dima);
//        coronaAttack(vlad);
//        coronaAttack(katya);

        System.out.println("THIRD WAVE OF CORONA");
        covid.attack(dima);
        covid.attack(vlad);
        covid.attack(katya);

//        coronaAttack(dima);
//        coronaAttack(vlad);
//        coronaAttack(katya);

        System.out.println("FOURTH WAVE OF CORONA");
        covid.attack(dima);
        covid.attack(vlad);
        covid.attack(katya);

//        coronaAttack(dima);
//        coronaAttack(vlad);
//        coronaAttack(katya);

//        boolean isAliveDima = isHumanAlive(dima);
//        boolean isAliveVlad = isHumanAlive(vlad);
//        boolean isAliveKatya = isHumanAlive(katya);
//
//        if (!isAliveDima) {
//            callEmergency(dima);
//        }
//
//        if (!isAliveVlad) {
//            callEmergency(vlad);
//        }
//
//        if (!isAliveKatya) {
//            callEmergency(katya);
//        }

        hillell_emergency_service.checkIsHumanAliveAndCure(dima);
        hillell_emergency_service.checkIsHumanAliveAndCure(vlad);
        hillell_emergency_service.checkIsHumanAliveAndCure(katya);

        covidResearchIndex = covidResearchIndex + einstein.performResearch();
        covidResearchIndex = covidResearchIndex + esmeralda.performResearch();
        covidResearchIndex = covidResearchIndex + alfred.performResearch();

        isCovidDefeated(covid);
    }


    private static void isCovidDefeated(Coronavirus coronavirus) {
        boolean isDefeated = covidResearchIndex >= 100;

        if (isDefeated) {
            System.out.println("HHHHHEEEEYY COVID DEFEATED !!!!");
            coronavirus.setCuredAndDestroyed(true);
        } else {
            System.out.println("HHHHHEEEEYY NOT DEFEATED YET!!!! STILL WAIT FOR RESEARCH, STATUS : " + covidResearchIndex);
        }
    }

    private static void coronaAttack(Human human) {

        if (human.getHealth() > 0) {
            int damage = getRandomInt(0, human.getHealth());
            human.setHealth(damage);
        }

        System.out.println("coronavirus attacked human ".concat(human.getName()));
        System.out.println("human health status :" + human.getHealth());
    }

    private static boolean isHumanAlive(Human human) {
        System.out.println("start checking is human : ".concat(human.getName()));

        boolean isAlive = true;

        int humanHealth = human.getHealth();

        if (humanHealth < 1) {
            System.out.println("Human ".concat(human.getName()).concat(" is dead"));
            isAlive = false;

//            call emergency by object
        }

        return isAlive;
    }

    private static void callEmergency(Human human) {
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
}
