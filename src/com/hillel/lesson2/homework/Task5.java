package com.hillel.lesson2.homework;

import java.net.BindException;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args){


        String a = "";


        int[] myList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int m = 0; m < myList.length; m++) {

            System.out.print(myList[m] + ", ");


        }


 //       I try all ways that you told me, but find only this - to drive from the new sting
        System.out.println(a);




        for (int i = 0; i < myList.length; i++) {
            if (i % 2 == 0)
                myList[i] *= 2;

            else myList[i] /= 2;


            System.out.print(myList[i] + ", ");
        }







    }
}
