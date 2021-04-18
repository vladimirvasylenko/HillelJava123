package com.hillel.lesson10.homework;

public interface Charging {
    default void charging(){
        System.out.println("Device is charging");
    }
}
