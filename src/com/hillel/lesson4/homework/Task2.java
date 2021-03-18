package com.hillel.lesson4.homework;

public class Task2 {
    /*Вывести на экран числа от 1 до 10 используя for.
    Пример: 1 2 3 4 5 6 7 8 9 10
    Реализовать в отдельном методе.*/

    public static void main(String[] args) {
        System.out.println(" " + digits());
    }

    public static int digits() {
        int i = 1;
        for (i = 1; i < 10; i++) {
            System.out.print(" " + i);
        }
        return i;
    }
}
