package com.hillel.lesson8.classwork;

public class ClassWork8 {

    static final String GIRL_SEX = "female";

    public static void main(String[] args) {

        IncapsulationExample incapsulationExample;

        incapsulationExample = new IncapsulationExample();

        incapsulationExample.setName("MyName");

        incapsulationExample.setAge(5);

        incapsulationExample.setSex("male");

        System.out.println(incapsulationExample);

        System.out.println("##########################################");

        IncapsulationExample incorrectIncapsulationExample = new IncapsulationExample();

        incorrectIncapsulationExample.setAge(-1);
        incorrectIncapsulationExample.setSex("unknown");

        System.out.println(incorrectIncapsulationExample);

        IncapsulationExample constructorExample = new IncapsulationExample("MyConstructorName");

        System.out.println(constructorExample);

        System.out.println("################################");

        IncapsulationExample objectConstructorExample = new IncapsulationExample(constructorExample);

        System.out.println(objectConstructorExample);

        IncapsulationExample girl_1 = new IncapsulationExample("Dina", 18, GIRL_SEX);
        IncapsulationExample girl_2 = new IncapsulationExample("Dina", 18, GIRL_SEX);
        IncapsulationExample girl_3 = new IncapsulationExample("Dina", 18, GIRL_SEX);
    }
}
