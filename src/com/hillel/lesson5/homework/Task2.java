package com.hillel.lesson5.homework;

import java.util.Scanner;

public class Task2 {
    /*Ввести с клавиатуры 5 чисел. Реализовать их вывод на консоль одной строчкой в отдельном методе.
    В логике использовать циклы и массивы.*/

    public static void main(String[] args) {

        Scanner scannerDigits = new Scanner(System.in);
        System.out.println("Введите 5 чисел: ");

        int[] myArray = new int[5];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = scannerDigits.nextInt();
        }
        scannerDigits.close();

        printArrayOfDigits(myArray);
    }

    public static void printArrayOfDigits(int[] oneMoreArray) {
        System.out.println(java.util.Arrays.toString(oneMoreArray));
    }
}
