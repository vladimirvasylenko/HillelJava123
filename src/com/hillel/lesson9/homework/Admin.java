package com.hillel.lesson9.homework;

import java.io.FileWriter;
import java.io.IOException;

public final class Admin extends User{

    public Admin() {
    }

    public Admin(String name, String surname, String mail, String password, String sex, String country) {
        super(name, surname, mail, password, sex, country);
    }




    public String textCheckAndDelete(boolean textChecker) throws IOException {

        if (textChecker == true){
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
