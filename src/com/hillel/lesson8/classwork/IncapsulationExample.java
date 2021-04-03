package com.hillel.lesson8.classwork;

public class  IncapsulationExample {

    private String name;

    private int age;

    private String sex;

    public IncapsulationExample() {
    }

    public IncapsulationExample(String name) {
        this(34, "male");
        this.name = name;
    }

    public IncapsulationExample(int age, String sex) {
        this.age = age;
        this.sex = sex;
    }

    public IncapsulationExample(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public IncapsulationExample(IncapsulationExample myObject){
        this.name = myObject.name;
        this.age = myObject.age;
        this.sex = myObject.sex;
    }

        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("it is not possible to have age less then 0");
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(sex.equals("male") || sex.equals("female")){
            this.sex = sex;
        } else {
            System.out.println("it is not possible to have sex different from male or female");
            this.sex = "male";
        }
    }

    @Override
    public String toString() {
        return "IncapsulationExample{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
