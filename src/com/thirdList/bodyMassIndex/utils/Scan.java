package com.thirdList.bodyMassIndex.utils;

import com.thirdList.bodyMassIndex.enums.Messages;
import com.thirdList.bodyMassIndex.service.CalculateBodyMass;

import java.util.Scanner;

public class Scan {

    public static String personName(){
        Scanner nameScan = new Scanner(System.in);
        System.out.print(Messages.INPUT_NAME_MESSAGE.getMessage());
        return nameScan.nextLine();
    }

    public static float weight(){
        Scanner weightScan = new Scanner(System.in);
        System.out.print(Messages.INPUT_WEIGHT_MESSAGE.getMessage());
        return weightScan.nextFloat();
    }

    public static float height(){
        Scanner heightScan = new Scanner(System.in);
        System.out.print(Messages.INPUT_HEIGHT_MESSAGE.getMessage());
        return heightScan.nextFloat();
    }
}
