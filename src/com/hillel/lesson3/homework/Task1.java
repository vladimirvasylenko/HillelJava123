package com.hillel.lesson3.homework;


import java.util.Scanner;

public class Task1 {

    public static void main(String[] args){

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя");

        if (myScanner.hasNextLine()){
            String name = myScanner.nextLine();
            System.out.println("Привет " + name);
        }
    }

}
