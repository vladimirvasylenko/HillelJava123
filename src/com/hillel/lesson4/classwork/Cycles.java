package com.hillel.lesson4.classwork;

public class Cycles {

    public static void main(String[] args) {

        int a = 100;
        int b = 500;

// simple cycle with while operator
        while (a < b) {
            System.out.println("Cycle operation starting:");
            a = a + 100;
            System.out.println("a value :" + a);
        }

        String myName = "Dima";
        String friendName_Dima = "Dima";
        String friendName = "Igor";

        while (myName.equals(friendName_Dima)) {
            friendName_Dima = friendName;
            System.out.println("friendName_Dima value" + friendName_Dima);
        }

//        simple cycle with do-while  operation
        int x = 1;
        int y = 50;

        do {
            System.out.println("x value is :" + x);
            System.out.println("y value is :" + y);
            System.out.println("first cycle starting");
            y = y - 5;
            System.out.println("first cycle ending");
        } while (x < y);
        {
            System.out.println("first cycle starting");
            y = y - 5;
            System.out.println("first cycle ending");
        }


        int firstVariable = 1;
        int secondVariable = 2;

        while (firstVariable == secondVariable) {
            System.out.println("never will be performed");
        }

        do {
            System.out.println("will be performed because that block started before operation while check");
        } while (false);


// simple for cycle operation
        int z = 25;
        int ax = 1;

        for (ax = 1; ax < z; ax++) {
            System.out.println("starting cycle iteration");
            System.out.println("x value is : " + x);
        }

        int[] myDigits = {1, 2, 3};

//        int neededVariable = myDigits[4];

        int myDigitsLength = myDigits.length;

        for (int xx = 0; xx < myDigitsLength; xx++) {
            int myDigitsVariable = myDigits[xx];
            System.out.println(myDigitsVariable);
        }

        for (int xx = 0; xx < myDigitsLength;) {
            int myDigitsVariable = myDigits[xx];
            xx++;
            System.out.println(myDigitsVariable);
        }
    }
}

