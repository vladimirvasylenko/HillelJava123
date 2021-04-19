package com.hillel.lesson12.classwork;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {
    public static void main(String[] args) {
        ObjectExample o1 = new ObjectExample("1");
        ObjectExample o2 = new ObjectExample("2");
        ObjectExample o3 = new ObjectExample("3");
        ObjectExample o4 = new ObjectExample("4");
        ObjectExample o5 = new ObjectExample("5");

        Set<ObjectExample> mySet = new HashSet<>();
        Set<ObjectExample> mySet2 = new HashSet<>();

        mySet.add(o1);
        mySet.add(o2);
        mySet.add(o3);
        mySet.add(o4);
        mySet.add(o5);
//        added the same object
        mySet.add(o5);

//        check is set contains object
        boolean isSetContainsObjectO1 = mySet.contains(o1);

//        check is set empty (contains or not elements)
        boolean isSetEmpty = mySet.isEmpty();

        mySet2.add(o1);
        mySet2.add(o2);
        mySet2.add(o3);
        mySet2.add(o4);
        //        added the same objects
        mySet2.add(o5);
        mySet2.add(o5);
        mySet2.add(o5);
        mySet2.add(o5);

//        for each loop iteration
        for (ObjectExample objectExample : mySet) {
            System.out.println(objectExample);
        }

        for (ObjectExample objectExample : mySet2) {
            System.out.println(objectExample);
        }
    }
}
