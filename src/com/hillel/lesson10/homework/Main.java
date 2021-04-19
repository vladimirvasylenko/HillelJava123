package com.hillel.lesson10.homework;

public class Main {
    /*Имея представления об обычных классах, абстрактных классах и интерфейсах
    необходимо создать следующие реализации:

    Создайте  2 цепочки классов(из примера в  классе: “Animal <- Cat <- Persian” / “People <- Employee <- FireMan”),
    только придумать свои классы. Условия:
    а). Всего классов для каждой цепочки должно быть 5;
    б). Один главный класс, второй -  наследуется от главного, и еще 3 класса, которые наследуются от второго;
    в). Главный класс и второй класс наследник должен быть “без возможности
    создавать экземпляр  класса”(подумайте какимиименно должны быть классы?)
    г). В каждом класса должно быть минимум по 2 характеристики и по 1методу(дополнительному);
    д). Для каждого класса реализуйте все необходимые методы для работы, зная пройденные принципы ООП;
    е). Финальные 3 класса-наследника в каждой цепочке должны быть “ненаследуемые”;

    ·Создайте 5 интерфейсов со следующими условиями:
    а). Должно быть 2 пары, один интерфейс наследуется от другого и 1 отдельный интерфейс;
    б). У каждого из 5 интерфейсов определите 2 заданных метода;
    в). Одна цепочка классов должна имплементировать одну связку интерфейсов,
    а вторая цепочка классов должна имплементировать другую связку интерфейсов и  оставшийся отдельный интерфейс;

    ·В классе Main создайте экземпляры всех классов и интерфейсов, запишите
    значения характеристик там где возможно и вызовите все реализованные дополнительные методы в них.*/

    public static void main(String[] args) {

        Iphone iphone = new Iphone("apple", 2021, "iOS", "white", "12", 128);
        Android android = new Android("Samsung", 2021, "Android", "White", "S21", 256);
        WindowsPhone windowsPhone = new WindowsPhone("Nokia", 2015, "Windows", "Black", "Lumia", 64);

        Macbook macbook = new Macbook("apple", 2021, "macOS", "Space gray", "Pro", 512);
        Ultrabook ultrabook = new Ultrabook("HP", 2020, "Windows", "Grey", "U2020", 1024);
        GamingNotebook gamingNotebook = new GamingNotebook("Lenovo", 2021, "Windows", "Black", "Legion", "RTX3080");

        iphone.call();
        iphone.goingToInternet();
        iphone.callingFaceTime();
        iphone.startApp();
        iphone.sendTelegramMessage();
        iphone.readTelegramMessage();
        iphone.closeApp();

        android.call();
        android.goingToInternet();
        android.callingDuo();
        android.startApp();
        android.sendTelegramMessage();
        android.readTelegramMessage();
        android.closeApp();

        windowsPhone.call();
        windowsPhone.goingToInternet();
        windowsPhone.callingSkype();
        windowsPhone.startApp();
        windowsPhone.sendTelegramMessage();
        windowsPhone.readTelegramMessage();
        windowsPhone.closeApp();

        macbook.start();
        macbook.callingFaceTime();
        macbook.goingToInternet();
        macbook.startIntellijIdea();
        macbook.startCoding();
        macbook.stopCoding();
        macbook.closeIntellijIdea();
        macbook.charging();

        ultrabook.start();
        ultrabook.goingToInternet();
        ultrabook.callingSkype();
        ultrabook.startIntellijIdea();
        ultrabook.startCoding();
        ultrabook.stopCoding();
        ultrabook.closeIntellijIdea();
        ultrabook.charging();

        gamingNotebook.start();
        gamingNotebook.goingToInternet();
        gamingNotebook.startingSkyrim();
        gamingNotebook.startIntellijIdea();
        gamingNotebook.startCoding();
        gamingNotebook.stopCoding();
        gamingNotebook.closeIntellijIdea();
        gamingNotebook.charging();
    }


}
