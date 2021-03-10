package com.hillel.lesson3.classwork;

import java.util.Scanner;

public class ScanerClasswork {

   public static void main(String[] args){

       Scanner scannerMyText = new Scanner(System.in);

       int enteredtext = scannerMyText.nextInt();

       System.out.println(enteredtext);

       scannerMyText.close();

    }
}
