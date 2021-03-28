package com.hillel.lesson6.homework;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    /*Необходимо записать любое четверостишие в файл и считать.
    Условия:
    о Директории, в которую будет запись файла, может изначально не существовать. Необходимо это учесть;
    о Файл соответственно должен создаваться при записи;
    о После записи необходимо проверить все ли записалось и вывести сообщение об успешной записи;
    о В завершение необходимо считать стих из созданного файла и вывести в консоль.*/

    static boolean testDirectory = new File("//Users//awesome//IdeaProjects//HillelJava//src//com//hillel//lesson6//homework//testDirectory").mkdir();
    static String filePath = "//Users//awesome//IdeaProjects//HillelJava//src//com//hillel//lesson6//homework//testDirectory//myText.txt";



    public static void main(String[] args) throws IOException {
        myFileWriter(filePath);
        myFileReader(filePath);
        fileCheck(filePath);




    }

    private static void myFileWriter(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write("А вот программисты, что всё притворяются,\n" +
                "Что в умных программах вовсю разбираются,\n" +
                "Но под прикрытием в игры играются,\n" +
                "Пока сисадмин сеть наладить пытается.");
        fileWriter.close();

//        if (filePath.equalsIgnoreCase("А вот программисты, что всё притворяются,\n " +
//                "Что в умных программах вовсю разбираются,\n" +
//                "Но под прикрытием в игры играются,\n" +
//                "Пока сисадмин сеть наладить пытается.")) {
//            System.out.println("ok");
//        } else {
//            System.out.println("fuck");
//        }

    }

    private static void fileCheck (String filePath) throws IOException{

        char []myArray = new char[1000];

        FileReader fileReader = new FileReader(filePath);
        fileReader.read(myArray);

        for (int i = 0; i < myArray.length; i++) {
            if (myArray)


        }
    }

    private static void myFileReader(String filePath) throws IOException{

//        FileReader fileReader = new FileReader(filePath);
//        Scanner myFileScanner = new Scanner(fileReader);
//
////        while (myFileScanner.hasNext()){
//            String myStr = myFileScanner.nextLine();
//            if (myStr.equalsIgnoreCase("А вот программисты, что всё притворяются,")){
//            }else if (myStr.equalsIgnoreCase("Что в умных программах вовсю разбираются,")){
//            }else if (myStr.equalsIgnoreCase("Но под прикрытием в игры играются,")){
//            }else if (myStr.equalsIgnoreCase("Пока сисадмин сеть наладить пытается.")){
//                System.out.println("ALL is OK");
//
//            }else {System.out.println("FUCK IT !!!");}
//        //}
//
//        fileReader.close();
//        myFileScanner.close();
        }



    }

