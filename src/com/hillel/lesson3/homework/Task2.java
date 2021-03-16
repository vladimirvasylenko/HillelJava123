package com.hillel.lesson3.homework;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random rnd = new Random();

        int intrnd1 = rnd.nextInt();
        int intrnd2 = rnd.nextInt();
        int intrnd3 = rnd.nextInt();

        double dblrnd1 = rnd.nextDouble();
        double dblrnd2 = rnd.nextDouble();
        double dblrnd3 = rnd.nextDouble();

        double summall = intrnd1 + intrnd2 + intrnd3 + dblrnd1 + dblrnd2 + dblrnd3;

        System.out.println(summall);
    }
}
