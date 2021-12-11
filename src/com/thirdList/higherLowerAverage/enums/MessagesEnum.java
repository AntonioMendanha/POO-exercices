package com.thirdList.higherLowerAverage.enums;

public enum MessagesEnum {
    START_PROGRAM("This program was buitl to read 5 numbers and returns the bigger, the lower and the average."),
    END_PROGRAM("Closing program..."),
    INPUT_NUMBER("Insert a number: "),
    BIGGER_MESSAGE("The bigger number is: "),
    LOWER_MESSAGE("The lower number is: "),
    AVERAGE_MESSAGE("The average of the typed numbers is: ");

    private String message;

    MessagesEnum(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
