package com.hillel.lesson9.homework;

import java.io.FileWriter;
import java.io.IOException;

public final class Admin extends User{

    public Admin() {
    }

    public Admin(String name, String surname, String mail, String password, String sex, String country) {
        super(name, surname, mail, password, sex, country);
    }


    public static String textCheckAndDelete(boolean textChecker) throws IOException {

        if (textChecker == true){
            FileWriter fileWriter = new FileWriter(filePath);
            fileWriter.write("");
            fileWriter.close();
            return "Deleted";
        } return "not Deleted";

    }
}
