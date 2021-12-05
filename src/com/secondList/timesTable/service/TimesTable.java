package com.secondList.timesTable.service;

public class TimesTable {

    public static void createTimesTable(int number) {
        for(int i = 0; i <= 10; i++) {
            System.out.printf("%2d * %2d = %2d %n",
                    number, i, ( number * i ));
        }
    }
}
