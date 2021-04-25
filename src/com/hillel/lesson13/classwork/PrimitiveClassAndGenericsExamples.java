package com.hillel.lesson13.classwork;

import java.util.ArrayList;

public class PrimitiveClassAndGenericsExamples {

    public static void main(String[] args) {
        int a = 1;
        String a_string = "1";
        long b = 2;
        double c = 2.0d;
        boolean d = false;

        Integer integer_string_value = Integer.valueOf(a_string);
        Integer integer_int_value = Integer.valueOf(a);

        Long longExample = Long.valueOf(b);

        Double doubleValue = Double.valueOf(c);

        Boolean booleanValue = Boolean.valueOf(d);

        ArrayList<String> myList = new ArrayList<>();

        ArrayList<? extends Student> myStudentChildList = new ArrayList<>();
        ArrayList<? super Student> myStudentChildList_2 = new ArrayList<>();

    }
}
