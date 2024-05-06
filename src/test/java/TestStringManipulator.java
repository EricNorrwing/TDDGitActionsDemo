import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.norrwing.tddgitdemo.StringManipulator;

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

    @Test
    @DisplayName("This is a failing test")
    public void failingTest () {
        Assertions.assertEquals(2, 3);
    }
}
