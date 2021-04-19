package com.hillel.lesson8.homework;

public class House {
    /*· Создайте класс House. Заполните Ваш новый дом “мебелью”(подсказка: отдельные классы), для примера достаточно до 5 вещей.
    У каждой вещи также должно быть пару характеристик.*/

    Table table = new Table("IKEA", "white", 120);
    Chair chair = new Chair("IKEA", "white", 40);
    Cupboard cupboard = new Cupboard("IKEA", "grey", 150);
    Sofa sofa = new Sofa("IKEA", "black", 130);
    Bed bed = new Bed("Skandi Wood", "brown", 200);
}

