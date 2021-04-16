package com.hillel.lesson9.homework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public final class Admin extends User {

    public Admin() throws IOException {
    }

    public Admin(String name, String surname, String mail, String password, String sex, String country) throws IOException {
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

    //    boolean checking = textChecker(checkingString());
    public String textCheckAndDelete(boolean textChecker) throws IOException {

        if (textChecker == true) {
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write("");
            fileWriter.close();
            System.out.println("You file is deleted");
            return "You file is deleted";
        }
        System.out.println("You file isn't deleted");
        return "You file isn't deleted";
    }
}
