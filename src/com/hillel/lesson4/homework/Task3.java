package com.hillel.lesson4.homework;

public class Task3 {
    /*Вывести на экран числа в порядке уменьшения от 100 до 0 с шагом в 10 единиц. Использовать while.
    Пример: 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0
    Реализовать в отдельном методе.*/

    public static void main(String[] args) {
        System.out.print(" " + digit());
    }

    public static int digit() {
        int a = 100;
        int b = 0;
        while (a > b) {
            System.out.print(" " + a);
            a = a - 10;
        }

        return a;
    }
}
