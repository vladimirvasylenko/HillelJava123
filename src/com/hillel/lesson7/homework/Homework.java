package com.hillel.lesson7.homework;

/*Задача на работу с классом/объектами:
о Создайте 2 Класса: Cat & Dog;
о У каждого класса задайте по 3 параметра;
о Создайте конструкторы без параметров, с 1, 2 и 3 параметрами;
о Важно: Имена параметров классов и входящих параметров в конструкторах должны совпадать! (Используем this);
о Создайте объекты описанных классов, используя все заданные конструкторы, в классе Main;
·  В классах Cat & Dog создайте для каждого из параметров два метода:
о Один метод должен записывать значение параметра (например: для name -> setName(String name));
о Второй метод должен возвращать значение необходимого параметра (например: для name -> getName());
о Для каждого параметра каждого класса должно быть 2 метода (1 set & 1 get);
·После чего попробуйте в классе Main задать параметры и вывести их значение в консоль обращаясь напрямую к параметрам
и через созданные методы.*/

public class Homework {

    public static void main(String[] args) {

        Cat tom = new Cat();
        tom.setName("Tom");
        tom.setAge(5);
        tom.setColor("grey");

        System.out.println(tom.name);
        System.out.println(tom.age);
        System.out.println(tom.color);
        System.out.println(tom.getName());
        System.out.println(tom.getAge());
        System.out.println(tom.getColor());

        Dog casper = new Dog();
        casper.setName("Casper");
        casper.setAge(10);
        casper.setColor("Black");

        System.out.println("\n" + casper.name);
        System.out.println(casper.age);
        System.out.println(casper.color);
        System.out.println(casper.getName());
        System.out.println(casper.getAge());
        System.out.println(casper.getColor());


    }
}
