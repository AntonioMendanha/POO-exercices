package com.secondList.calculator.service;

public class Operations {

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
    public static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    public static int divides(int firstNumber, int secondNumber) {
        //float firstNum = firstNumber;
        //float secondNum = secondNumber;
        return  firstNumber / secondNumber;
    }
    public static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public static int results(int operationNumber, int firstNumber, int secondNumber) {
        int result = 0;
        switch (operationNumber) {
            case 1:  result = sum(firstNumber, secondNumber);
                break;
            case 2:  result = subtract(firstNumber, secondNumber);
                break;
            case 3:  result = divides(firstNumber, secondNumber);
                break;
            case 4:  result = multiply(firstNumber, secondNumber);
                break;
            default:
                System.out.println("Invalid Choices - Repeat the operation");
                break;
        }
        return result;
    }

}
