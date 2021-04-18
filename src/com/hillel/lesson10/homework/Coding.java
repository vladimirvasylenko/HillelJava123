package com.hillel.lesson10.homework;

public interface Coding extends IntellijIdea{

    default void startCoding(){
        System.out.println("Start coding");
    }

    default void stopCoding(){
        System.out.println("Stop coding");
    }
}
