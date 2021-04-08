package com.hillel.lesson9.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public final class Support extends User {

    public Support(String name, String surname, String mail, String password, String sex, String country) {
        super(name, surname, mail, password, sex, country);
    }

//     public static String checkingString(){
//         Scanner myScanner = new Scanner(System.in);
//         System.out.println("Введите строку для проверки : ");
//         String str = myScanner.nextLine();
//         return str;
//     }

    public static boolean textChecker() throws IOException {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Введите строку для проверки : ");
        String str = myScanner.nextLine();

        FileReader myFileReader = new FileReader(filePath);
        Scanner scannerCheck = new Scanner(myFileReader);
        String checkStr = scannerCheck.nextLine();

        boolean result = false;



        while (scannerCheck.hasNextLine()){
            if (checkStr.equalsIgnoreCase(str)) {
                result = true;
            }else result = false;
        }

        myScanner.close();
        myFileReader.close();
        scannerCheck.close();

        return result;

//        return textChecker();







    }
}
