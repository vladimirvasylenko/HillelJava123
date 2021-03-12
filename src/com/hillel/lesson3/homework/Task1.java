package com.hillel.lesson3.homework;


import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner myName = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String name = myName.nextLine();


        Scanner mySurmane = new Scanner(System.in);
        System.out.println("Введите Вашу фамилию:");
        String surname = mySurmane.nextLine();


        Scanner myAge = new Scanner(System.in);
        System.out.println("Укажите сколько Вам полных лет:");
        int age = myAge.nextInt();


//        if (myAge.hasNextInt()) {
//            int age = myAge.nextInt();
//        }
//        else {
//            System.out.println("Нужно ввести возраст!");
//        }

        Scanner myMail = new Scanner(System.in);
        System.out.println("Введите Вашу почту для регистрации:");
        String mail = myMail.nextLine();


        Scanner myAbout = new Scanner(System.in);
        System.out.println("Напишите несколько слов о себе:");
        String about = myAbout.nextLine();

        myName.close();
        mySurmane.close();
        myAge.close();
        myMail.close();
        myAbout.close();



        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Возраст: " + age);
        System.out.println("Почта: " + mail);
        System.out.println("О себе: " + about);


    }

}
