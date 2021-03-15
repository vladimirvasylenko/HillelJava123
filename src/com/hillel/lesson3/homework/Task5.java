package com.hillel.lesson3.homework;

import java.util.Random;

public class Task5 {

    public static void main(String[] args) {

        int minWage = 5000;
        int maxWage = 10000;
        int dif = maxWage - minWage;

        Random myWage = new Random();
        int wage = myWage.nextInt(dif + 1);
        wage += minWage;
        System.out.println("Ваша зароботная плата за этот месяц сосавляет: " + wage + "$");




    }



}
