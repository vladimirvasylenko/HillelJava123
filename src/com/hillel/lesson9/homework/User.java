package com.hillel.lesson9.homework;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User {

    static String filePath = "C:\\Users\\vasyl\\IdeaProjects\\HillelJava1\\src\\com\\hillel\\lesson9\\homework\\Text.txt";

    private String name;
    private String surname;
    private String mail;
    private String password;
    private String sex;
    private String country;

    public User() {
    }

    public User(String name, String surname, String mail, String password, String sex, String country) {
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.password = password;
        this.sex = sex;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public final void textReader() {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Entered you text: ");
        String myText = myScanner.nextLine();
        System.out.println("You text is: ".concat(myText));
        myScanner.close();
    }

    public void textWriter() throws IOException {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Entered you text: ");
        String myText = myScanner.nextLine();

        FileWriter myFileWriter = new FileWriter(filePath);
        myFileWriter.write(myText);

        myScanner.close();
        myFileWriter.close();
    }

}
