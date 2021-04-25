package com.hillel.lesson13.classwork;

import java.util.*;

public class MapExample {

    static Map<String, String> myHashMap = new HashMap<>();
    static Map<String, String> myLinkedHashMap = new LinkedHashMap<>();
    static Map<String, String> myTreeMap = new TreeMap<>();

    public static void main(String[] args) {

        String key_1 = "key_1";
        String key_2 = "key_2";
        String key_3 = "key_3";
        String key_4 = "key_4";
        String key_5 = "key_5";
        String key_6 = "a_key_5";

        String country_1 = "Ukraine";
        String country_2 = "Spain";
        String country_3 = "Italy";
        String country_4 = "Canada";
        String country_5 = "Lithia";
        String country_6 = "Jamaica";

        myHashMap.put(key_1, country_1);
        myHashMap.put(key_2, country_2);
        myHashMap.put(key_3, country_3);
        myHashMap.put(key_4, country_4);
        myHashMap.put(key_5, country_5);

        System.out.println(myHashMap);

        myLinkedHashMap.put(key_1, country_1);
        myLinkedHashMap.put(key_2, country_2);
        myLinkedHashMap.put(key_3, country_3);
        myLinkedHashMap.put(key_4, country_4);
        myLinkedHashMap.put(key_5, country_5);

        System.out.println(myLinkedHashMap);

        myTreeMap.put(key_1, country_1);
        myTreeMap.put(key_2, country_2);
        myTreeMap.put(key_3, country_3);
        myTreeMap.put(key_4, country_4);
        myTreeMap.put(key_5, country_5);
        myTreeMap.put(key_6, country_6);

        System.out.println(myTreeMap);

        String firstValue = myHashMap.get(key_1);

//        for iteration for map
        for(Map.Entry<String, String> entry : myHashMap.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key is ".concat(key));
            System.out.println("value is ".concat(value));
        }

//        for iteration for map with iterator object
       Iterator<Map.Entry<String, String>> iterator = myHashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("while loop key is ".concat(key));
            System.out.println("while loop value is ".concat(value));

        }

//        for iteration for map keys or values
        for (String key : myHashMap.keySet()){
            System.out.println("for each loop key is ".concat(key));
        }

        for (String value : myHashMap.values()){
            System.out.println("for each loop value is ".concat(value));
        }
    }
}
