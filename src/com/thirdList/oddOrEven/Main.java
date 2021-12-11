package com.thirdList.oddOrEven;

import com.thirdList.oddOrEven.service.OddOrEven;
import com.thirdList.oddOrEven.utils.Printer;
import com.thirdList.oddOrEven.utils.Scan;

public class Main {

    public static void main(String[] args) {

        //Start program
        Printer.startProgram();

        int[] list = OddOrEven.numbersList();
        int[] oddList = OddOrEven.createOddList(list);
        int[] evenList = OddOrEven.createEvenList(list);
        OddOrEven.oddNumbersFirst(oddList, evenList);


        //End program
        Printer.endProgram();
    }
}
