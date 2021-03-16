package com.hillel.lesson3.homework;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner newScan = new Scanner(System.in);
        System.out.println("Введите количество учасников :");
        int scr = newScan.nextInt();

        newScan.close();

        Random newRand = new Random();
        int finalRand = newRand.nextInt(scr) + 1;
        System.out.println("Поздравляем с победой участника под номером № " + finalRand);
    }
}
