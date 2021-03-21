package com.hillel.lesson5.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    /*Ввести с клавиатуры 5 чисел. Реализовать их вывод на консоль одной строчкой в отдельном методе.
    В логике использовать циклы и массивы.*/

    public static void main(String[] args) {

        Scanner digits = new Scanner(System.in);
        System.out.println("Введите 5 чисел: ");

        int[] myArray = new int[5];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = digits.nextInt();
        }
        digits.close();

        printDigits(myArray);
    }

    public static void printDigits(int[] mySecondArray) {
        System.out.println(Arrays.toString(mySecondArray));
    }


}
