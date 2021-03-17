package com.hillel.lesson4.homework;

import java.util.Scanner;

public class Task8 {
    /*Предположим что у нас есть сайт, где ограничено посещение пользователей от 18 до 50 лет.
    Необходимо написать программу, которая будет запрашивать год Вашего рождения
    и выдавать следующие ответы:
    о “Вход строго с 18 лет” (Если пользователю меньше 18 лет);
    о “Добро пожаловать” (Если возраст от 18 до 50 лет);
    о “Вам будет не интересно на этом сайте(Если больше 50);*/

    static int currentYear = 2021;

    public static void main(String[] args) {

        System.out.println("Введите год вашего рождения: ");
        Scanner ageInput = new Scanner(System.in);
        int inpudedAge = ageInput.nextInt();
        ageInput.close();

        if (currentYear - inpudedAge < 18) {
            System.out.println("Вход строго с 18 лет");
        } else if (currentYear - inpudedAge > 50) {
            System.out.println("Вам будет не интересно на этом сайте");
        } else {
            System.out.println("Добро пожаловать");
        }

    }

}
