package com.hillel.lesson9.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public final class Support extends User {

    public Support(String name, String surname, String mail, String password, String sex, String country) {
        super(name, surname, mail, password, sex, country);
    }

    String myString = checkingString();

     public static String checkingString(){
         Scanner myScanner = new Scanner(System.in);
         System.out.println("Введите строку для проверки : ");
         return myScanner.nextLine();
     }


    public static boolean textChecker(String myString) throws IOException {

//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Введите строку для проверки : ");
//        String str = myScanner.nextLine();

        boolean test = false;

        FileReader myFileReader = new FileReader(filePath);
        Scanner scannerCheck = new Scanner(myFileReader);
        String checkStr = scannerCheck.nextLine();


        while (scannerCheck.hasNextLine()){
            if (checkStr.equalsIgnoreCase(myString)) {
                return test = true;
            }
        }

//        myScanner.close();
        myFileReader.close();
        scannerCheck.close();

        return test;





//        return textChecker();







    }
}
