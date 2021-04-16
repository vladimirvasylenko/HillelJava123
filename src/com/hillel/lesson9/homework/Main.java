package com.hillel.lesson9.homework;

import java.io.IOException;
import java.util.Scanner;

public class Main {
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

    ·  Далее имея все необходимые классы, зная принцип “динамической диспетчеризации методов” и команду “instanceof”
    создайте метод, который будет принимать на вход User(какого-то) и в зависимости от типа вызывать методы:
    User = написать строку
    Support = написать строку + проверить наличие этой строки в файле
    Admin = написать строку + проверить + удалить файл, если такая строка найдена.*/

    public static final Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        User user = new User();
        Support support = new Support();
        Admin admin = new Admin();

        user.textWriter();

        System.out.println("User started");
        whatUser(user);

        System.out.println("Support started");
        whatUser(support);

        System.out.println("Admin started");
        whatUser(admin);

        Main.myScanner.close();
    }

    private static void whatUser(User user) throws IOException {

        if (user instanceof Support) {
            ((Support) user).textChecker(((Support) user).checkingString());
        } else if (user instanceof Admin){
            ((Admin) user).textCheckAndDelete(((Admin) user).textChecker(((Admin) user).checkingString()));
        } else if (user instanceof User) {
            user.textReader();
        }

    }
}
