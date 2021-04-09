package com.hillel.lesson9.homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User {
    /*·  Создайте класс User, у которого будет несколько полей(имя, фамилия, почта, пароль, пол, страна).
    Соблюдая принципы инкапсуляции реализуйте в нем все необходимые методы/конструкторы для дальнейшей работы.

    ·  Так же у данного класса должно быть 2 метода:
    а). Читать. Принимает текст, ничего не возвращает, выводит сообщение принятое в консоль.
    Данный метод необходимо задать как “неизменяемый”.
    б). Писать. Ничего не принимает, просто считывает текст с клавиатуры и сохраняет введенный текст в файл.

    ·  Создать 2 Класса-наследника от User: Support & Admin. Данные классы должны быть заданы,
    как классы от которых невозможно больше наследоваться.
    Так же для этих классов необходимо определить все необходимые базовые методы для дальнейшей работы.

    ·  У класса Support определить дополнительный метод-проверки строки.
    Этот метод должен на вход принимать строку и проверять наличие этой строки в файле.
    Обратно возвращать значение “содержит/не содержит”(подумайте какая переменная лучше всего подходит для данного типа)

    ·  У класса Admin реализовать другой метод-удаления. Данный метод на вход получает значение “содержит/ не содержит”
    и в зависимости от этого значения удаляет файл(если содержит).

    ·  Далее имея все необходимые классы, зная принцип “динамической диспетчеризации методов”
    и команду “instanceof” создайте метод,
     который будет принимать на вход User(какого-то) и в зависимости от типа вызывать методы:
     User = написать строку
     Support = написать строку + проверить наличие этой строки в файле
     Admin = написать строку + проверить + удалить файл, если такая строка найдена.*/

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

    public static void textWriter() throws IOException {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Entered you text: ");
        String myText = myScanner.nextLine();

        FileWriter myFileWriter = new FileWriter(filePath);
        myFileWriter.write(myText);

        myScanner.close();
        myFileWriter.close();
    }

}
