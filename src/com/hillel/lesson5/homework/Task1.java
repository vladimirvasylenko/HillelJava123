package com.hillel.lesson5.homework;

import java.util.Scanner;

public class Task1 {
    /*реализовать ввод имени (string) с консоли, выполнить проверку имени на равенство к слову Hillel.
    если равно - "добро пожаловать на курс + имя", если нет - "дoбро пожаловать + имя"*/

    public static void main(String[] args) {

        Scanner scannerName = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scannerName.nextLine();
        scannerName.close();

        if (name.equalsIgnoreCase("Hillel")){
            System.out.println("Добро пожаловать на курс " + name);
        } else {
            System.out.println("Дoбро пожаловать " + name);
        }
    }
}
