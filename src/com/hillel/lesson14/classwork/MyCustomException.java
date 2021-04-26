package com.hillel.lesson14.classwork;

public class MyCustomException extends Exception {
    @Override
    public String getMessage() {
        return "my custom exception is there!)";
    }
}
