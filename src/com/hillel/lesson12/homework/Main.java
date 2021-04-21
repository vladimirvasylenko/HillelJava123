package com.hillel.lesson12.homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    /*Выполните все пункты как одно решение задачи:

    Создайте 3 класса, в каждом из которых будет по одному методу с разным названием(Остальное не имеет значения);

    Создайте Список(List);

    Создайте метод, который будет принимать и возвращать Список, и проводить с ним следующе итерации:
    а). Если список пустой, добавьте в него 6 объектов 1го Вашего класса;
    б). После добавьте в начало списка 3 объекта 2го Вашего класса;
    в). После замените последние 3 элемента списка на 3 объекта 3го Вашего
    класса;

    Создайте второй метод, который на вход будет принимать Список и возвращать список и
    будет выполнять следующую логику: Проверять количество экземпляров класса в принятом Списке
    и оставлять только по 2 экземпляра каждого из 3 Ваших классов(то есть, 6 объектов в сумме).*/


    public static void main(String[] args) {

        List<Object> myList = new ArrayList<>();

        System.out.println(myListAddOperation(myList));
//        System.out.println(myListRemoveOperation(myList));


    }

    public static List myListAddOperation(List myList) {

        HomeworkClass_1 homeworkClass1object1 = new HomeworkClass_1();
        HomeworkClass_1 homeworkClass1object2 = new HomeworkClass_1();
        HomeworkClass_1 homeworkClass1object3 = new HomeworkClass_1();
        HomeworkClass_1 homeworkClass1object4 = new HomeworkClass_1();
        HomeworkClass_1 homeworkClass1object5 = new HomeworkClass_1();
        HomeworkClass_1 homeworkClass1object6 = new HomeworkClass_1();

        if (myList.isEmpty()) {
            myList.add(homeworkClass1object1);
            myList.add(homeworkClass1object2);
            myList.add(homeworkClass1object3);
            myList.add(homeworkClass1object4);
            myList.add(homeworkClass1object5);
            myList.add(homeworkClass1object6);
        }

        HomeworkClass_2 homeworkClass2object1 = new HomeworkClass_2();
        HomeworkClass_2 homeworkClass2object2 = new HomeworkClass_2();
        HomeworkClass_2 homeworkClass2object3 = new HomeworkClass_2();

        myList.add(0, homeworkClass2object1);
        myList.add(0, homeworkClass2object2);
        myList.add(0, homeworkClass2object3);

        HomeworkClass_3 homeworkClass3object1 = new HomeworkClass_3();
        HomeworkClass_3 homeworkClass3object2 = new HomeworkClass_3();
        HomeworkClass_3 homeworkClass3object3 = new HomeworkClass_3();

        for (int i = myList.size() -1; i > myList.size() - 3;) {
            myList.set(i--, homeworkClass3object1);
            myList.set(i--, homeworkClass3object2);
            myList.set(i, homeworkClass3object3);
        }
        return myList;
    }

//    public static List myListRemoveOperation(List myList) {
//
//        int a = 0;
//
//
//        Iterator<Object> iterator = myList.iterator();
//
//        while (iterator.hasNext()){
//            if (iterator.next() instanceof HomeworkClass_1){
//            }
//        }
//        myList
//
//        return myList;
//    }



    }
