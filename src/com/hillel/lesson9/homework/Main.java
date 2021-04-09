package com.hillel.lesson9.homework;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        User user = new User();
        Support support = new Support();
        Admin admin = new Admin();

        User link;
        link = user;

        link = support;
        link = admin;

        link.textReader();







    }

}
