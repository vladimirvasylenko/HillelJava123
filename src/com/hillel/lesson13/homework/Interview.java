package com.hillel.lesson13.homework;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Interview {
    static String filePath = "C:\\Users\\vasyl\\IdeaProjects\\HillelJava\\src\\com\\hillel\\lesson13\\homework\\MyFile.txt";

    static String question_1 = "How old are you?";
    static String question_2 = "Where you from?";
    static String question_3 = "What brand of you phone?";

    static Map<String, HashMap<String, String>> myHashMap = new HashMap<>();
    static Map<String, String> answerHashMap = new HashMap<>();

    public static void questions() throws IOException {

        FileWriter myFileWriter = new FileWriter(filePath);
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Entered you name : ");
        String name = myScanner.nextLine();
        myHashMap.put(name, (HashMap<String, String>) answerHashMap);

        System.out.println(question_1);
        String answer_1 = myScanner.nextLine();
        answerHashMap.put(question_1, answer_1);

        System.out.println(question_2);
        String answer_2 = myScanner.nextLine();
        answerHashMap.put(question_2, answer_2);

        System.out.println(question_3);
        String answer_3 = myScanner.nextLine();
        answerHashMap.put(question_3, answer_3);

        myFileWriter.write(String.valueOf(myHashMap));

        myFileWriter.close();
        myScanner.close();
    }
}
