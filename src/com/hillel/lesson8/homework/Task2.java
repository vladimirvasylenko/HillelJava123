package com.hillel.lesson8.homework;

public class Task2 {
    /*· Создайте класс с 3 параметрами final. Создайте в нем конструктор по-умолчанию и конструктор со всеми параметрами.
    Создайте для всех полей getter и setter.
    ps: Задание с подвохом. Если что-то заметили, закомментируйте эту  часть кода и напишите комментарий.*/

    static final String PARAMETER_1 = "test1";
    static final String PARAMETER_2 = "test2";
    static final int PARAMETER_3 = 777;

    private String parameter4;
    private int parameter5;

    public Task2(String PARAMETER_1, String PARAMETER_2, int PARAMETER_3, String parameter4, int parameter5) {
        this.parameter4 = parameter4;
        this.parameter5 = parameter5;
    }

    public String getParameter1() {
        return PARAMETER_1;
    }

//    cant ser PARAMETER 1,2,3 - because they are static.

//    public void setParameter1(){
//        this.PARAMETER_1 = PARAMETER_1;
//    }

    public String getParameter2() {
        return PARAMETER_2;
    }

    public int getParameter3() {
        return PARAMETER_3;
    }

    public String getParameter4() {
        return parameter4;
    }

    public void setParameter4() {
        this.parameter4 = parameter4;
    }

    public int getParameter5() {
        return parameter5;
    }

    public void setParameter5() {
        this.parameter5 = parameter5;
    }
}
