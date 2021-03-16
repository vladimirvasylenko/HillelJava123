package com.hillel.lesson4.classwork;

public class IfElse {
    public static void main(String[] args) {

//        int a = 1;
//        int b = 2;
//        int c = 3;
//
//        if (c > b) {
//            System.out.println("first if check is true");
//        }else if (b > a){
//            System.out.println("second if check is true");
//        }else{
//            System.out.println("always false because 3>2 and 2>1");
//        }

        String[] cats = {"Kurzik", "Barsik", "Kotik", "Bizik", "Dexter"};

        int catsLength = cats.length;

        for (int a = 0; a < catsLength; a++){

            String catName = cats[a];

            if (catName.startsWith("K")){
                System.out.println("Cat sex is mail and name :" + catName);
            } else if (catName.startsWith("B")){
                System.out.println("cat name B");
            }else {
                System.out.println("Thast cat Dexter" + catName);
            }

        }
    }
}
