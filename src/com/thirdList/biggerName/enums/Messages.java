package com.thirdList.biggerName.enums;

public enum Messages {
    START_PROGRAM("This program was buitl to read 5 names provided by the user, put then in a guessList and then return the bigger name."),
    END_PROGRAM("Closing program..."),
    INPUT_NAME_MESSAGE("Insert a name: "),
    BIGGER_NAME_MESSAGE("The bigger name is: ");

    private String message;

    Messages(String message) { this.message = message; }

    public String getMessage() {
        return message;
    }
}
