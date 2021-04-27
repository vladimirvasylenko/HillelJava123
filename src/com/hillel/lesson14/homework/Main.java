package com.hillel.lesson14.homework;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    /*Создайте класс, в которому будут 3 отдельных метода, логика которых будет вызывать 3
    разные “проверяемые”(checked) ошибки. Ошибки можете вызвать принудительно в ходе какой-то логики(не принципиально);

    Создайте еще один класс, у которого будет также три промежуточных метода, которые просто
    будут вызывать по одному методу первого класса.  Эти методы не должны обрабатывать возможные  ошибки,
    а просто пробрасывают  полученную  ошибку  выше;

    Используя методы второго класса(промежуточного), в классе Main реализуйте методы использования следующих конструкций
    обработки ошибок:
    а) try-catch-finally;
    б) try-catch-catch-finally;
    в) try-catch-catch-catch-finally;
    г) try(with resources)-catch-finally;
    д) try-finally (в каждой конструкции try должны быть
    вызовы 3х методов промежуточного класса с разными ошибками).*/

    public static void main(String[] args) throws FileNotFoundException {
        ExceptionThrowClass exceptionThrowClass = new ExceptionThrowClass();

        try {
            exceptionThrowClass.exceptionThrowsMethod_1();
            exceptionThrowClass.exceptionThrowsMethod_2();
            exceptionThrowClass.exceptionThrowsMethod_3();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound exception is catch");
        } finally {
            System.out.println("First exception is catch");
        }

        try {
            exceptionThrowClass.exceptionThrowsMethod_1();
            exceptionThrowClass.exceptionThrowsMethod_2();
            exceptionThrowClass.exceptionThrowsMethod_3();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound exception is catch");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException exception is catch");
        } finally {
            System.out.println("First and second exceptions is catch");
        }

        try {
            exceptionThrowClass.exceptionThrowsMethod_1();
            exceptionThrowClass.exceptionThrowsMethod_2();
            exceptionThrowClass.exceptionThrowsMethod_3();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound exception is catch");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException exception is catch");
        } catch (IllegalStateException e) {
            System.out.println("IllegalStateException exception is catch");
        } finally {
            System.out.println("First, second and third exception is catch");
        }

        try {
            FileReader fileReader = new FileReader("D:\\abc.txt");
        } catch (IOException e) {
            e.getStackTrace();
        } finally {
            System.out.println("Try with resources exception is catch");
        }

        try {
            exceptionThrowClass.exceptionThrowsMethod_1();
            exceptionThrowClass.exceptionThrowsMethod_2();
            exceptionThrowClass.exceptionThrowsMethod_3();
        } finally {
            System.out.println("finally we are here!");
        }
    }

}
