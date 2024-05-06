package se.norrwing.tddgitdemo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestStringManipulator {

    static StringManipulator stringManipulator;
    @BeforeAll
    public static void setUp(){
        stringManipulator = new StringManipulator();
    }
    @Test
    @DisplayName("Testing the String Manipulator")
    public void formatTextTest() {
        Assertions.assertEquals("This is a string", stringManipulator.formatText("tHiS iS A sTrInG"));
    }
}
