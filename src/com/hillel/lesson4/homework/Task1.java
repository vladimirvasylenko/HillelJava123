package com.hillel.lesson4.homework;

public class Task1 {
    /*Вывести на экран числа от 1 до 10 используя while.
    Пример: 1 2 3 4 5 6 7 8 9 10
    Реализовать в отдельном методе.*/


    public static void main(String[] args) {
        System.out.print(whileDigit());
    }

    public static int whileDigit() {
        int a = 1;
        while (a < 10) {

            System.out.print(a + " ");
            a++;
        }
        return a;
    }
}
