package com.hillel.lesson8.homework;

public class House {
    /*· Создайте класс House. Заполните Ваш новый дом “мебелью”(подсказка: отдельные классы), для примера достаточно до 5 вещей.
    У каждой вещи также должно быть пару характеристик.*/

    private Bed bed;
    private Sofa sofa;
    private Chair chair;
    private Table table;
    private Cupboard cupboard;

        public House(Bed bed, Sofa sofa, Chair chair, Table table, Cupboard cupboard) {
                this.bed = bed;
                this.sofa = sofa;
                this.chair = chair;
                this.table = table;
                this.cupboard = cupboard;
        }

        public Bed getBed() {
                return bed;
        }

        public void setBed(Bed bed) {
                this.bed = bed;
        }

        public Sofa getSofa() {
                return sofa;
        }

        public void setSofa(Sofa sofa) {
                this.sofa = sofa;
        }

        public Chair getChair() {
                return chair;
        }

        public void setChair(Chair chair) {
                this.chair = chair;
        }

        public Table getTable() {
                return table;
        }

        public void setTable(Table table) {
                this.table = table;
        }

        public Cupboard getCupboard() {
                return cupboard;
        }

        public void setCupboard(Cupboard cupboard) {
                this.cupboard = cupboard;
        }

        @Override
        public String toString() {
                return "House{" +
                        "bed=" + bed +
                        ", sofa=" + sofa +
                        ", chair=" + chair +
                        ", table=" + table +
                        ", cupboard=" + cupboard +
                        '}';
        }
}

