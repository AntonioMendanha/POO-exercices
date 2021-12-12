package com.thirdList.bodyMassIndex.enums;

public enum Messages {
    START_PROGRAM("This program was buitl to read 5 people (name, heigth and weigth), calculate each Body Mass Index and returns if somebody is out of the ideal weigth."),
    END_PROGRAM("Closing program..."),
    INPUT_NAME_MESSAGE("Insert a name: "),
    INPUT_WEIGHT_MESSAGE("Insert weigth in Kg (ex: 72,4): "),
    INPUT_HEIGHT_MESSAGE("Insert heigth in meters (ex: 1,72): "),
    RESULTS_MESSAGE("Here the results ..........");

    private String message;

    Messages(String message) { this.message = message; }

    public String getMessage() {
        return message;
    }
}
