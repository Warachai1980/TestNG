

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringManipulationTest {
    //Test Driven Development aka TDD
    @Test
    public void testConvertFirstLetterToUppercase() {
        StringManipulation stringManipulation = new StringManipulation();
        String testWords = "tech lead academy";

        String expected = "Tech Lead Academy";
        String actual = stringManipulation.convertFirstLetterToUppercase(testWords);

        Assert.assertEquals(actual, expected, "Not all words were uppercase");
    }

    @Test
    public void testConvertFirstLetterToUppercase2() {
        StringManipulation stringManipulation = new StringManipulation();
        String testWords = "United stated of America";

        String expected = "United Stated Of America";
        String actual = stringManipulation.convertFirstLetterToUppercase(testWords);

        Assert.assertEquals(actual, expected, "Not all words were uppercase");
    }

    @Test
    public void testUppercase(){
        StringManipulation stringmanipulation = new StringManipulation();
        String testWords = "Games Warachai wongwichit";

        String expected = "GWW";
        String actual = stringmanipulation.Uppercase(testWords);

        Assert.assertEquals(actual, expected);
    }
}