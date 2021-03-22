package com.hillel.lesson5.homework;

import java.util.Scanner;

public class Task3 {
    /*Ввести с клавиатуры треззначное число, только с помощью математических операторов разбить его на три цифры
     и вывести в консоль (т.е. если число 123, вывести 1,2,3)*/

    public static void main(String[] args) {

        Scanner enterDigit = new Scanner(System.in);
        System.out.println("Введите трехзначное число: ");
        int myDigit = enterDigit.nextInt();

        int a = myDigit / 100;
        int b = myDigit / 10 % 10;
        int c = myDigit % 10;

        System.out.println(a + ", " + b + ", " + c + ".");
    }
}
