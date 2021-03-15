package com.hillel.lesson3.homework;

import java.util.Random;

public class Task5 {

    static int minWage = 5000;
    static int maxWage = 10000;

    public static void main(String[] args) {

        System.out.println(myWageRandom());
        System.out.println(myWageMathRandom());

    }

        public static int myWageRandom() {


            int dif = maxWage - minWage;

            Random myWage = new Random();
            int wageRandom = myWage.nextInt(dif + 1);
            wageRandom += minWage;
            return wageRandom;
        }

    public static int myWageMathRandom(){

        int wageMathRrandom = minWage + (int)(Math.random()*((maxWage-minWage)+1));

        return wageMathRrandom;
    }



}
