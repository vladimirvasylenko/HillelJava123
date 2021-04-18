package com.hillel.lesson10.homework;

public interface IntellijIdea {

    default void startIntellijIdea(){
        System.out.println("Intellij Idea is starting");
    }

    default void closeIntellijIdea(){
        System.out.println("IntellijIdea is closed");
    }
}
