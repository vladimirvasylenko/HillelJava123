package com.hillel.lesson14.homework;

public class MyException extends Exception{

    @Override
    public String getMessage() {
        return "my Exception";
    }
}
