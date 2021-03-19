package com.hillel.lesson4.homework;

public class Task6 {
    /*Дано 10 чисел (возможно массив). Напечатайте наименьшее из них в консоль,
    используя циклические и условные операторы.*/

    public static void main(String[] args) {

        int[] myList = {20, 50, 623, 283, 23, 874, 12, 574, 56, 465};

        int min = myList[0];
        for (int i = 0; i < myList.length; i++) {
            if (myList[i] < min) {
                min = myList[i];
            }
        }
        System.out.println(min);
    }
}
