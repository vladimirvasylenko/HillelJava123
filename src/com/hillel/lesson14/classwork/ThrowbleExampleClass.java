package com.hillel.lesson14.classwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThrowbleExampleClass {

    public static void main(String[] args) throws Exception{

//        getException();

        try {
            getException();
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }

//        throw new MyCustomRuntimeException();

    }

    static private void getException() throws MyCustomException {
        int a = 4;
        int b = 2;
        int c = 0;

        List<String> myArrayList = new ArrayList<>();
        myArrayList.add("firstElement");
        try {
            Scanner scanner = new Scanner(System.in);
            scanner.close();
            String someLine = scanner.nextLine();
            int result = a / b;
//            String myArrayListElement = myArrayList.get(11);
            String myArrayListElement = myArrayList.get(0);
            int error_result = b / c;
//            int error_result = 6;
            System.out.println(myArrayListElement + result + error_result);
        } catch (IndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("exception is caught : ".concat(e.toString()));
        } catch (Exception e) {
            System.out.println("exception is caught");
        } finally {
            System.out.println("finally block is there !!!");

            try {
                int second_wrong_result = 6/0;
            } catch (Exception e) {
                System.out.println("finally block exception is caught!!");
            }
        }

        System.out.println("end of method !!!");

        throw new MyCustomException();
    }
}
