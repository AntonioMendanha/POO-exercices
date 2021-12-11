package com.thirdList.higherLowerAverage.service;

import com.thirdList.higherLowerAverage.enums.MessagesEnum;
import com.thirdList.higherLowerAverage.utils.Printer;
import com.thirdList.higherLowerAverage.utils.Scan;

public class Calculate {

    private final static int TOTAL_NUMBERS = 5;

    private static int inputNumber(){
        return Scan.inputNumber();
    }
    private static int[] numberList() {
        int[] list = new int[TOTAL_NUMBERS];
        return list;
    }
    private static int totalNumberSum(int total, int number) {
        int newTotal = total + number;
        return newTotal;
    }
    private static float average(int total){
        float amount = TOTAL_NUMBERS;
        float average = total / amount;
        return average;
    }
    private static int biggerNumber(int[] list) {
        int bigger = list[0];
        for (int i = 0; i < TOTAL_NUMBERS; i++){

            if(bigger < list[i]){
                bigger = list[i];
            }
        }
        return bigger;
    }

    private static int lowerNumber(int[] list) {
        int lower = list[0];
        for (int i = 0; i < list.length; i++){
            if( lower > list[i]){
                lower = list[i];
            }
        }
        return lower;
    }

    public static int inputListNumbers() {
        int[] list = numberList();
        int total = 0;

        for(int i = 0; i < TOTAL_NUMBERS ; i++) {
            int number = inputNumber();
            list[i] = number;
            total = totalNumberSum(total, number);
        }

        float averageList = average(total);
        Printer.averageMessage(averageList);
        int bigger = biggerNumber(list);
        Printer.biggerMessage(bigger);
        int lower = lowerNumber(list);
        Printer.lowerMessage(lower);


        return total;
    }
}
