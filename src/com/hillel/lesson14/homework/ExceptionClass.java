package com.hillel.lesson14.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionClass {

    public static void exception_1() throws FileNotFoundException {

        FileReader fileReader = new FileReader("D:\\abc.txt");
    }

    public static void exception_2() {

        int num = Integer.parseInt("XYZ");
    }

    public static void exception_3() {

        Scanner scanner = new Scanner(System.in);
        scanner.close();
        String someLine = scanner.nextLine();
    }

}
