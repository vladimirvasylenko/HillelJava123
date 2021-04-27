package com.hillel.lesson14.homework;

import java.io.FileNotFoundException;

public class ExceptionThrowClass {

    ExceptionClass exceptionClass = new ExceptionClass();

    public void exceptionThrowsMethod_1() throws FileNotFoundException {
        ExceptionClass.exception_1();
    }

    public void exceptionThrowsMethod_2() throws NumberFormatException {
        ExceptionClass.exception_2();
    }

    public void exceptionThrowsMethod_3() throws IllegalStateException {
        ExceptionClass.exception_3();
    }
}
