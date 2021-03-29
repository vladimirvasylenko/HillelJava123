package com.hillel.lesson7.homework;

public class Dog {

    public String name;
    public int age;
    public String color;

    public Dog(){
        String name = this.name;
        int age = this.age;
        String color = this.color;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
