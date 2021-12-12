package com.thirdList.formatedWord.enums;

public enum Messages {
    START_PROGRAM("This program reads a word provided by the user and return the word with some letters (in the odd number index) in uppercase."),
    END_PROGRAM("Closing program..."),
    INPUT_WORD("Type a word here: "),
    RESULT_MESSAGE("Here it is your word formated -> ");

    private String message;

    Messages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
