package com.hillel.lesson4.homework;

public class Task1 {
    /*Вывести на экран числа от 1 до 10 используя while.
    Пример: 1 2 3 4 5 6 7 8 9 10
    Реализовать в отдельном методе.*/


    public static void main(String[] args) {
        Task1.digits();
    }

    public static void digits() {
        int a = 0;
        while (a++ < 10) {
            System.out.print(a + " ");
        }
    }
}
