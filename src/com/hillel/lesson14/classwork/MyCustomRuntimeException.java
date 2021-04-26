package com.hillel.lesson14.classwork;

public class MyCustomRuntimeException extends RuntimeException{

    public MyCustomRuntimeException() {
    }

    @Override
    public String getMessage() {
        return "my custom runtime exception is there!)";
    }
}
