package com.hillel.lesson4.homework;

public class Task2 {
    /*Вывести на экран числа от 1 до 10 используя for.
    Пример: 1 2 3 4 5 6 7 8 9 10
    Реализовать в отдельном методе.*/

    public static void main(String[] args) {
        digits();
    }

    public static void digits() {
        for (int i = 1; i < 11; i++) {
            System.out.print(" " + i);
        }
    }
}
