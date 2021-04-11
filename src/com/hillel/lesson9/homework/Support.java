package com.hillel.lesson9.homework;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public final class Support extends User {

    public Support() {
    }

    public Support(String name, String surname, String mail, String password, String sex, String country) {
        super(name, surname, mail, password, sex, country);
    }



     public String checkingString(){
         Scanner myScanner = new Scanner(System.in);
         System.out.println("Введите строку для проверки : ");
         String str = myScanner.nextLine();
         myScanner.close();
         return str;
     }

    public boolean textChecker(String str) throws IOException {

        FileReader myFileReader = new FileReader(filePath);
        Scanner scannerCheck = new Scanner(myFileReader);

        while (scannerCheck.hasNextLine()){
            String checkStr = scannerCheck.nextLine();
            if (checkStr.equalsIgnoreCase(str)) {
                return true;
            }
        }

        myFileReader.close();
        scannerCheck.close();

        return false;

    }
}
