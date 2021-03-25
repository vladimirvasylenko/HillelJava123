package com.hillel.lesson6.classwork;

public class ClassWork {

    public static void main(String[] args) {

        String name = "Dima";

        String myNameAndSurname = name + "Laletin";

//        cannot b performed because String is immutable class
//        name + "Laletin";

        String myString = new String("My test data String");
        String mySimpleString = new String("Test");

//        String length();
        int myStringLength = myString.length();
        int myTestStringLength = mySimpleString.length();

        System.out.println("My string length is : " + myStringLength);
        System.out.println("My test string length is : " + myTestStringLength);

//        String toCharArray();
        char[] myStringCharArray = myString.toCharArray();

        System.out.println("myStringCharArray value :");
        System.out.println(myStringCharArray.toString());

//        String trim();
        String myTestStringToTrim = "  My test trim string ";

        System.out.println("trimmed without new String object\n");
        System.out.println(myTestStringToTrim.trim());
        System.out.println("trimmed without new String object length : " + myTestStringToTrim.trim().length());

        String myTestStringTrimmed = myTestStringToTrim.trim();
        System.out.println("trimmed with new String object\n");
        System.out.println(myTestStringTrimmed);
        System.out.println("trimmed with new String object length : " + myTestStringTrimmed.trim().length());

//        String isEmpty();
        String nullString = null;
        String noCharsValueString = " ";

        boolean isEmptyNullString = nullString == null;
        boolean isEmptyCharsValueString = nullString == null;

//        null object does not have length
//        boolean isEmptyMethodNullString = nullString.isEmpty();

        boolean isEmptyMethodCharsValueString = noCharsValueString.isEmpty();

        System.out.println("just pause for break points\n");

//        String String.valueOf;
        Boolean logicValue = true;
        String logicValueString = String.valueOf(logicValue);
        System.out.println(logicValueString);

        System.out.println("String value :");
        System.out.println(mySimpleString);

//        String charAt() + indexOf();
        char mySimpleStringcharCharValue = mySimpleString.charAt(2);
        int mySimpleStringcharIndexValue = mySimpleString.indexOf('s');

        System.out.println(mySimpleString);

//        String equals();
        String firstStringToTestEquals = "My test String";
        String firstStringToTestEquals2 = "My test String";
        String secondStringToTestEquals = "my test string";

        boolean isEqualFirstStringToSecondString = firstStringToTestEquals.equals(secondStringToTestEquals);
        boolean isEqualFirstStringToSameFirstButAnotherObjectString = firstStringToTestEquals.equals(firstStringToTestEquals2);
        boolean isEqualFirstStringToSecondStringIgnoreCase = firstStringToTestEquals.equalsIgnoreCase(firstStringToTestEquals2);

        System.out.println("breakpoint pause");

//        String substring();
        String testStringForSubstring = "my test substring string";

        System.out.println("Test substring \n");
        System.out.println(testStringForSubstring.substring(3));
        System.out.println(testStringForSubstring.substring(3, 7));

        //        String toUpperCase();
        String upperCaseString = testStringForSubstring.toUpperCase();
        System.out.println(upperCaseString);
    }
}
