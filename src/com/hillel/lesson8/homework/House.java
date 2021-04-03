package com.hillel.lesson8.homework;

public class House {
    /*· Создайте класс House. Заполните Ваш новый дом “мебелью”(подсказка: отдельные классы), для примера достаточно до 5 вещей.
    У каждой вещи также должно быть пару характеристик.*/

    static final String BRAND = "IKEA";

    public static void main(String[] args) {
        Table table = new Table(BRAND,"white",120);
        Chair chair = new Chair(BRAND, "white", 40);
        Cupboard cupboard = new Cupboard(BRAND, "grey", 150);
        Sofa sofa = new Sofa(BRAND, "black", 130);
        Bed bed = new Bed("Skandi Wood", "brown", 200);

    }
}

