package com.hillel.lesson14.classwork;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class TryWithResourceExample {

    public static void main(String[] args) {
        getOneMoreException();
    }

    static private void getOneMoreException() {

        try (Scanner scanner = new Scanner(new File("myDimaFile.txt"))) {
            System.out.println("my logic of method !");
        } catch (FileNotFoundException e) {
            System.out.println("file not found exception is caught !");
            System.out.println("detailed exception information :" + Arrays.toString(e.getStackTrace()));
        }
    }
}
