package com.thirdList.analyzingPeople.enums;

public enum Messages {
        START_PROGRAM("This program reads 5 people (name and age) and returns the older, the younger and average age."),
        END_PROGRAM("Closing program..."),
        INPUT_NEW_PERSON_MESSAGE("New person -> Input the name and age"),
        INPUT_NAME_MESSAGE("Name: "),
        INPUT_AGE_MESSAGE("Age: "),
        OLDER_MESSAGE("The older person is -> "),
        YOUNGER_MESSAGE("The younger person is -> "),
        AVERAGE_MESSAGE("The average age of this 5 people is -> ");

        private String message;

        Messages(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
}
