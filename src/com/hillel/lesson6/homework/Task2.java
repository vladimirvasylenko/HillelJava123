package com.hillel.lesson6.homework;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    /*Необходимо записать любое четверостишие в файл и считать.
    Условия:
    о Директории, в которую будет запись файла, может изначально не существовать. Необходимо это учесть;
    о Файл соответственно должен создаваться при записи;
    о После записи необходимо проверить все ли записалось и вывести сообщение об успешной записи;
    о В завершение необходимо считать стих из созданного файла и вывести в консоль.*/

    static boolean testDirectory = new File("C:\\Users\\vasyl\\IdeaProjects\\HillelJava\\src\\com\\hillel\\lesson6\\homework\\testDirectory").mkdir();
    static String filePath = "C:\\Users\\vasyl\\IdeaProjects\\HillelJava\\src\\com\\hillel\\lesson6\\homework\\testDirectory\\Text.txt";

    public static void main(String[] args) throws IOException {
        fileWriter(filePath);
        fileCheсker(filePath);
        fileReader(filePath);
    }

    private static void fileWriter(String filePath) throws IOException {

        FileWriter fileWriter = new FileWriter(filePath);
        fileWriter.write("А вот программисты, что всё притворяются,\n" +
                "Что в умных программах вовсю разбираются,\n" +
                "Но под прикрытием в игры играются,\n" +
                "Пока сисадмин сеть наладить пытается.");
        fileWriter.close();
    }

    private static void fileCheсker(String filePath) throws IOException {

        FileReader fileReader = new FileReader(filePath);
        Scanner fileScanner = new Scanner(fileReader);

        while (fileScanner.hasNextLine()) {
            String myStr = fileScanner.nextLine();

            if (myStr.equalsIgnoreCase("А вот программисты, что всё притворяются,")) {
                System.out.println("Firs string is written");
            } else if (myStr.equalsIgnoreCase("Что в умных программах вовсю разбираются,")) {
                System.out.println("Second string is written");
            } else if (myStr.equalsIgnoreCase("Но под прикрытием в игры играются,")) {
                System.out.println("Third string is written");
            } else if (myStr.equalsIgnoreCase("Пока сисадмин сеть наладить пытается.")) {
                System.out.println("Fourth string is written");
            } else {
                System.out.println("Something written incorrectly");
            }
        }

        fileReader.close();
        fileScanner.close();
    }

    private static void fileReader(String filePath) throws IOException {

        FileReader fileReader = new FileReader(filePath);
        Scanner fileScanner = new Scanner(fileReader);

        while (fileScanner.hasNextLine()) {
            String myStr = fileScanner.nextLine();
            System.out.print("\n" + myStr);
        }
    }


}

