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

        Cat cat = new Cat();
        Cat max = new Cat("Max");
        Cat lux = new Cat("Lux", 5);
        Cat fox = new Cat("Fox", 5, "black");

//        max.name = "Tom";
//        cat.age = 4;
//        cat.color = "grey";
//
//        System.out.println(cat.name);
//        System.out.println(cat.age);
//        System.out.println(cat.color);

        cat.setName("Flex");
        cat.setAge(6);
        cat.setColor("white");

        System.out.println("\n" + cat.getName());
        System.out.println(cat.getAge());
        System.out.println(cat.getColor());

        Dog dog = new Dog();
        Dog muhtar = new Dog("Muhtar");
        Dog jac = new Dog("Jac", 10);
        Dog john = new Dog("John", 8, "black");

        dog.setName("Casper");
        dog.setAge(10);
        dog.setColor("Black");

        System.out.println("\n" + dog.getName());
        System.out.println(dog.getAge());
        System.out.println(dog.getColor());

//        dog.name = "Luis";
//        dog.age = 15;
//        dog.color = "red";
//
//        System.out.println("\n" + dog.name);
//        System.out.println(dog.age);
//        System.out.println(dog.color);


    }
}
