package se.norrwing.tddgitdemo;

public class StringManipulator {
    public StringManipulator() {
    }

    public String formatText (String input) {

        return input.substring(0,1).toUpperCase()+input.substring(1).toLowerCase();
    }
}
