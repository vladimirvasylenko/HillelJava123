package com.hillel.lesson4.homework;

public class Task4 {
    /*Вывести на экран числа в порядке уменьшения от 100 до 0 с шагом в 10 единиц. Использовать for.
    Пример: 100, 90, 80, 70, 60, 50, 40, 30, 20, 10, 0
    Реализовать в отдельном методе.*/

    public static void main(String[] args) {
        digits();
    }

    public static void digits() {
        for (int i = 100; i > -1; i = i - 10) {
            System.out.print(" " + i);
        }
    }
}
