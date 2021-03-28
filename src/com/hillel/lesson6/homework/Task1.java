package com.hillel.lesson6.homework;

import java.util.Locale;

public class Task1 {
    /*Дана строка: “ Hillel is my feature. I will be developer   ”

    Необходимо выполнить следующие действия:
    о Проверить не пустой ли заданный текст;
    о Вывести длину данного текста;
    о Вывести длину данного текста убрав лишние пробелы вначале и конце текста;
    о Используя команду получения значения из строки по индексу вывести “I”;
    о Используя команду обрезания вывести “developer”;
    о Добавить в конце строки знак “!”;
    о Выполните сравнение заданной строки со строкой: “Hillel is my feature.
      I will be DEVELOPER” так, чтобы в одном случае они были равны, а в другом не равны;
    о Выведите данную строку в нижнем регистре;
    о Выведите данную строку в верхнем регистре;*/

    public static void main(String[] args) {
        String myHomeworkString = " Hillel is my feature. I will be developer   ";

        System.out.println(myHomeworkString.isEmpty());
        System.out.println(myHomeworkString.length());
        System.out.println(myHomeworkString.trim().length());

        int myIndexOf = myHomeworkString.indexOf("I"); // Что-бы не считать в ручную, используем метод indexOf.
        System.out.println(myHomeworkString.charAt(myIndexOf));
        System.out.println(myHomeworkString.substring(33, 42));

        StringBuilder myHomeworkAnotherString = new StringBuilder(myHomeworkString);
        myHomeworkAnotherString.append("!");

        boolean equalseWthoutIgnoreCase = myHomeworkString.equals("Hillel is my feature. I will be DEVELOPER");
        boolean equalseWthIgnoreCase = myHomeworkString.trim().equalsIgnoreCase("Hillel is my feature. I will be DEVELOPER");

        System.out.println(myHomeworkString.toLowerCase());
        System.out.println(myHomeworkString.toUpperCase());

    }
}
