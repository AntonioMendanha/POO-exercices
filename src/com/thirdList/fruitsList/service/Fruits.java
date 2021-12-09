package com.thirdList.fruitsList.service;

public class Fruits {

    private final static int LIST_LENGTH = 5;

    public static String fruitName() {
        String fruit = Scan.scanFruit();
        System.out.printf("%s added to list.%n %n", fruit);
        return fruit;
    }

    public static String[] fruitList() {
        String[] list = new String[LIST_LENGTH];
        for (int i = 0; i < LIST_LENGTH; i++) {
            list[i] = fruitName();
        }
        return list;
    }
}
