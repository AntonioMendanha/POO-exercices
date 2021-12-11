package com.thirdList.oddOrEven.service;

import com.thirdList.oddOrEven.utils.Printer;
import com.thirdList.oddOrEven.utils.Scan;

import java.util.Arrays;
import java.util.stream.IntStream;

public class OddOrEven {
    //Escreva um programa que lê 5 números.
    //Ao final, escreva primeiros todos os ímpares, depois todos os pares.
    final static int NUMBER_LIST_LENGTH = 5;

    public static int inputNumber() {
        return Scan.inputNumber();
    }

    public static int[] numbersList() {
        int[] number = new int[NUMBER_LIST_LENGTH];
        int evenAmount = 0;
        int oddAmount = 0;

        for (int i = 0; i < NUMBER_LIST_LENGTH; i++ ){
            number[i] = Scan.inputNumber();
        }
        System.out.println(Arrays.toString(number));
        return number;
    }

    private static int evenNumberAmount(int[] list){
        int evenAmount = 0;
        for (int i = 0; i < list.length; i++ ){
            if (list[i] % 2 == 0){
                evenAmount++;
            }
        }
        return evenAmount;
    }

    private static int oddNumberAmount(int[] list){
        int oddAmount = 0;
        for (int i = 0; i < list.length; i++ ){
            if (list[i] % 2 != 0){
                oddAmount++;
            }
        }
        return oddAmount;
    }

    public static int[] createEvenList(int[] list) {
        int lentghList = evenNumberAmount(list);
        int[] evenList = new int[lentghList];
        int indexEvenList = 0;
        for (int i =0; i < list.length ;i++){
            if(list[i] % 2 == 0){
                evenList[indexEvenList] = list[i];
                indexEvenList++;
            }
        }
        return evenList;
    }

    public static int[] createOddList(int[] list) {
        int lentghList = oddNumberAmount(list);
        int[] oddList = new int[lentghList];
        int indexOddList = 0;
        for (int i = 0; i < list.length ;i++) {
            if(list[i] % 2 != 0) {
                oddList[indexOddList] = list[i];
                indexOddList++;
            }
        }
        return oddList;
    }

    public static void oddNumbersFirst(int[] oddList, int[] evenList) {
        Printer.oddNumber();
        System.out.println(Arrays.toString(oddList));
        Printer.evenNumber();
        System.out.println(Arrays.toString(evenList));
        int[] newNumbersList = IntStream.concat(
                Arrays.stream(oddList), Arrays.stream(evenList))
                .toArray();
        System.out.printf("%n New list with odd numbers first -> %s %n", Arrays.toString(newNumbersList));
    }
}
