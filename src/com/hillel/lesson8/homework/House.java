package com.hillel.lesson8.homework;

public class House {
    /*· Создайте класс House. Заполните Ваш новый дом “мебелью”(подсказка: отдельные классы), для примера достаточно до 5 вещей.
    У каждой вещи также должно быть пару характеристик.*/

    Table table = new Table("IKEA", "white", 120);
    Chair chair = new Chair("IKEA", "white", 40);
    Cupboard cupboard = new Cupboard("IKEA", "grey", 150);
    Sofa sofa = new Sofa("IKEA", "black", 130);
    Bed bed = new Bed("Skandi Wood", "brown", 200);

    public House() {
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    public Cupboard getCupboard() {
        return cupboard;
    }

    public void setCupboard(Cupboard cupboard) {
        this.cupboard = cupboard;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public void setSofa(Sofa sofa) {
        this.sofa = sofa;
    }

    public Bed getBed() {
        return bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    @Override
    public String toString() {
        return "House{" +
                "table=" + table +
                ", chair=" + chair +
                ", cupboard=" + cupboard +
                ", sofa=" + sofa +
                ", bed=" + bed +
                '}';
    }
}

