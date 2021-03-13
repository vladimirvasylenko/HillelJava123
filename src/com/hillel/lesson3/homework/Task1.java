package com.hillel.lesson3.homework;


import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        String name = myScanner.nextLine();


        System.out.println("Введите Вашу фамилию:");
        String surname = myScanner.nextLine();


        System.out.println("Укажите сколько Вам полных лет:");
        String age = myScanner.nextLine();


//        Scanner myMail = new Scanner(System.in);
        System.out.println("Введите Вашу почту для регистрации:");
        String mail = myScanner.nextLine();


 //       Scanner myAbout = new Scanner(System.in);
        System.out.println("Напишите несколько слов о себе:");
        String about = myScanner.nextLine();

        myScanner.close();
//        myMail.close();




        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Возраст: " + age);
        System.out.println("Почта: " + mail);
        System.out.println("О себе: " + about);


    }

}
