package com.hillel.lesson8.homework;

public class Main {

    public static void main(String[] args) {
        Table table = new Table("IKEA", "white", 120);
        Chair chair = new Chair("IKEA", "white", 40);
        Cupboard cupboard = new Cupboard("IKEA", "grey", 150);
        Sofa sofa = new Sofa("IKEA", "black", 130);
        Bed bed = new Bed("Skandi Wood", "brown", 200);

        House house = new House(bed, sofa, chair, table, cupboard);

        System.out.println(house);
    }
}
