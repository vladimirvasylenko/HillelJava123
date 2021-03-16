package com.hillel.lesson3.homework;

public class Task6 {


    public static void main(String[] args) throws Exception {

        Task6 myMath = new Task6();

        System.out.println(Task6.addition(1, 2));
        System.out.println(Task6.subtraction(6, 2));
        System.out.println(myMath.devise(5, 2));
        System.out.println(myMath.multiply(5.3, 2));
    }

    public static int addition(int a, int b) {
        return (a += b);
    }

    public static int subtraction(int a, int b) {
        return (a -= b);
    }

    public double devise(double a, double b) {
        return (a /= b);
    }

    public double multiply(double a, double b) {
        return (a *= b);
    }


}
