package com.hillel.lesson4.classwork;

public class Cycles {
    public static void main(String[] args) {

//        int a = 100;
//
//        int b = 500;
//
//        while (a<b){
//            System.out.println("Cycle operation starting:");
//            a = a + 100;
//            System.out.println("a value :" + a);
//        }
//
//        String myName = "Vova";
//        String friedName_Vova = "Vova";
//        String friendName = "Dima";
//
//        while (myName.equals(friendName)){
//            friedName_Vova = friendName;
//            System.out.println("friendname_Vova value" + friedName_Vova);
//        }
//
//        int x = 1;
//        int y = 50;
//
//        do {
//            System.out.println("x value is :" + x);
//            System.out.println("y value is :" + y);
//            System.out.println("first cycle starting");
//            y = y -5;
//            System.out.println("first cycle ending");
//        } while (x < y); {
//
//        }

        int z = 25;
        int x = 1;



        for (x = 1; x < z; x++) {
            System.out.println("starting cycle interation");
            System.out.println("x value is :" + x);

        }

        int[] myDigits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int myDigitsLenght = myDigits.length;

        for (int xx = 0; x < myDigitsLenght - 1; xx++) {
            System.out.println(myDigits[xx]);
        }





    }
}
