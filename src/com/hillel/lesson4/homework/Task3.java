package com.hillel.lesson4.homework;

public class Task3 {
    /*Вывести на экран числа в порядке уменьшения от 100 до 0 с шагом в 10 единиц. Использовать while.
    Пример: 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0
    Реализовать в отдельном методе.*/

    public static void main(String[] args) {
        digit();
    }

    public static void digit() {
        int a = 110;

        while (a > 0) {
            a = a - 10;
            System.out.print(" " + a);
        }


    }
}
