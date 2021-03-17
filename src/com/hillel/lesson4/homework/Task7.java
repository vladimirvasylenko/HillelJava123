package com.hillel.lesson4.homework;

public class Task7 {
    /*Создайте массив из 10 чисел от 1 до 10. В одном из циклических операторов
    пройдетесь по нему и выведете следующие сообщения:
    о Если четное - “{число} - это четно число”
    о Если не четное - “{число} - это число не четное”
    Пример:
    1 - не четное число
    2 - четное число
    3 - не четное число*/

    public static void main(String[] args) {

        int[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < myList.length; i++) {
            if (myList[i] % 2 == 0) {
                System.out.println(myList[i] + " - это четное число");
            } else {
                System.out.println(myList[i] + " - это число не четное");
            }
        }
    }
}
