package com.hillel.lesson8.homework;

public class Task3 {
    /*· Создайте новый класс, у которого должно быть 9 переменных (8 примитивов + String);
    Для каждой переменной напишите getter и setter;
    Напишите конструкторы начиная от конструктора по-умолчанию до конструктора с 9 параметрами;*/


    byte a;
    short b;
    int c;
    long d;
    double e;
    float f;
    char g;
    boolean h;
    String i;

    public byte getA() {
        return a;
    }

    public void setA() {
        this.a = a;
    }

    public short getB() {
        return b;
    }

    public void setB() {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC() {
        this.c = c;
    }

    public long getD() {
        return d;
    }

    public void setD() {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE() {
        this.e = e;
    }

    public float getF() {
        return f;
    }

    public void setF() {
        this.f = f;
    }

    public char getG() {
        return g;
    }

    public void setG() {
        this.g = g;
    }

    public boolean getH() {
        return h;
    }

    public void setH() {
        this.h = h;
    }

    public String getI() {
        return i;
    }

    public void setI() {
        this.i = i;
    }

    public Task3() {
    }

    public Task3(byte a) {
        this.a = a;
    }

    public Task3(byte a, short b) {
        this((byte) 1);
        this.b = b;
    }

    public Task3(byte a, short b, int c) {
        this((byte) 1, (short) 2);
        this.c = c;
    }

    public Task3(byte a, short b, int c, long d) {
        this((byte) 1, (short) 2, 3);
        this.d = d;
    }

    public Task3(byte a, short b, int c, long d, double e) {
        this((byte) 1, (short) 2, 3, 4);
        this.e = e;
    }

    public Task3(byte a, short b, int c, long d, double e, float f) {
        this((byte) 1, (short) 2, 3, 4, 5.1);
        this.f = f;
    }

    public Task3(byte a, short b, int c, long d, double e, float f, char g) {
        this((byte) 1, (short) 2, 3, 4, 5.1, 6.1f);
        this.g = g;
    }

    public Task3(byte a, short b, int c, long d, double e, float f, char g, boolean h) {
        this((byte) 1, (short) 2, 3, 4, 5.1, 6.1f, (char) 7);
        this.h = h;
    }

    public Task3(byte a, short b, int c, long d, double e, float f, char g, boolean h, String i) {
        this((byte) 1, (short) 2, 3, 4, 5.1, 6.1f, (char) 7, true);
        this.i = i;
    }
}
