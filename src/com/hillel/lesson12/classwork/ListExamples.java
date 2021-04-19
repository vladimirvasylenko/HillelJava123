package com.hillel.lesson12.classwork;

import java.time.LocalTime;
import java.util.*;

public class ListExamples {

    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<>(5);

        //  interface can not be object
        //  List<String> notObject = new List();

        //  adding elements to ArrayList
        stringArrayList.add("name1");
        stringArrayList.add("name2");
        stringArrayList.add("name3");
        stringArrayList.add("name4");
        stringArrayList.add("name5");

        // adding elements to ArrayList by one line
//        Collections.addAll(stringArrayList, "name1", "name2", "name3", "name4", "name5");

        // get ArrayList element by index
        String element = stringArrayList.get(0);

        // check is ArrayList contains object
        boolean aa2 = stringArrayList.contains("name3");
        boolean bb2 = stringArrayList.contains("name9");

        // adding element to ArrayList by defined index
        stringArrayList.add(0, "name0");
        System.out.println(stringArrayList);

        // updating element in ArrayList by defined index
        stringArrayList.set(0, "updatedData");
        System.out.println(stringArrayList);

        // delete element in ArrayList by defined index
        stringArrayList.remove(1);
        System.out.println(stringArrayList);

        // get element in ArrayList by defined index
        String arrayElement_by_index_2 = stringArrayList.get(2);
        System.out.println(arrayElement_by_index_2);

        // get ArrayList size (returns the number of elements in this list)
        int myListSize = stringArrayList.size();

        // convert ArrayList to array
        String[] stringsArray =  new String[stringArrayList.size()];
        stringsArray = stringArrayList.toArray(stringsArray);
        System.out.println(Arrays.toString(stringsArray));


        // iterator for array list
        Iterator<String> iterator = stringArrayList.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println("myList data element : ".concat(next));
        }

        // simplified iterator(for each)  for array list
        for (String a : stringArrayList) {
            System.out.println(a);
        }

        //  no capacity is set in constructor
        List<String> stringLinkedList = new LinkedList<>();

        //  adding elements to LinkedList
        stringLinkedList.add("linkedData1");
        stringLinkedList.add("linkedData2");
        stringLinkedList.add("linkedData3");
        stringLinkedList.add("linkedData4");
        stringLinkedList.add("linkedData5");

        // adding elements to LinkedList by one line
        // Collections.addAll(stringLinkedList, "linkedData1", "linkedData2", "linkedData3", "linkedData4", "linkedData5");

        // get ArrayList element by index
        String stringLinkedListElement = stringLinkedList.get(0);

        // updating element in LinkedList by defined index
        stringLinkedList.set(2, "updatedData2");
        System.out.println(stringLinkedList);

        // delete element in ArrayList by defined index
        stringLinkedList.remove(1);
        System.out.println(stringLinkedList);

        // get LinkedList size (returns the number of elements in this list)
        int size = stringLinkedList.size();
        System.out.println(stringLinkedList);

//        check performances of operations ArrayList vs LinkedList
        List<String> myArrayList = new ArrayList<>();
        Collections.addAll(myArrayList, "1", "2", "3", "4", "5");

        int counter = 100000;
        int starter = 0;

        LocalTime localTime = LocalTime.now();
        System.out.println("array list started at : " + localTime.toString());

        while (starter < counter) {
            starter++;
            myArrayList.set(3, "updated");
//            myArrayList.add(4, String.valueOf(starter));
//            myArrayList.remove(0);
        }

        LocalTime localTime2 = LocalTime.now();
        System.out.println("array list finished at : " + localTime2.toString());


        List<String> myLinkedList = new LinkedList<>();
        Collections.addAll(myLinkedList, "1", "2", "3", "4", "5");

        LocalTime localTime3 = LocalTime.now();
        starter = 0;
        System.out.println("linked list started at : " + localTime3.toString());

        while (starter < counter) {
            starter++;
            myLinkedList.set(3, "updated");
//            myLinkedList.add(4, String.valueOf(starter));
//            myLinkedList.remove(0);
        }

        LocalTime localTime4 = LocalTime.now();
        System.out.println("linked list finished at : " + localTime4.toString());
    }
}
