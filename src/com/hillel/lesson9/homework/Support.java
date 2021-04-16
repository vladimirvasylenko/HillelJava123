package com.hillel.lesson9.homework;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public final class Support extends User {

    static String filePath = "C:\\Users\\vasyl\\IdeaProjects\\HillelJava\\src\\com\\hillel\\lesson9\\homework\\Text.txt";

    public Support() {
    }

    public Support(String name, String surname, String mail, String password, String sex, String country) {
        super(name, surname, mail, password, sex, country);
    }

    public String checkingString() {

        System.out.println("Entered text for checking : ");
        String str = Main.myScanner.nextLine();
        return str;
    }

    public boolean textChecker(String str) throws IOException {

        FileReader myFileReader = new FileReader(filePath);
        Scanner fileScan = new Scanner(myFileReader);

        while (fileScan.hasNextLine()) {
            String checkStr = fileScan.nextLine();
            if (checkStr.equalsIgnoreCase(str)) {
                System.out.println("You file have : " + str);
                return true;
            }
        }

        myFileReader.close();
        fileScan.close();
        System.out.println("You file haven't : " + str);
        return false;
    }
}
