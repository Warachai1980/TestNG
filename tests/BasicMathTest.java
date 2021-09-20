import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BasicMathTest {

    @Test
    public void sumTest() {
        BasicMath math = new BasicMath();
        int testData1 = 5;
        int testData2 = 7;

        int expectedResultSum = testData1 + testData2;
        int actualResultSum = math.sum(testData1, testData2);

        Assert.assertEquals(actualResultSum,expectedResultSum);
    }

    @Test
    public  void subtractTest(){
        BasicMath math = new BasicMath();
        int testData1 = 5;
        int testData2 = 7;

        int expectedResultSub = testData1 - testData2;
        int actualResultSub = math.subtract(testData1,testData2);

        Assert.assertEquals(actualResultSub,expectedResultSub);
    }

    @Test
    public void divideTest(){

        BasicMath math = new BasicMath();
        double testData1 = 5.0;
        double testData2 = 7.0;

        double expectedResultDiv = testData1 / testData2;
        double actualResultDiv = math.divide(testData1,testData2);

        Assert.assertEquals(actualResultDiv,expectedResultDiv,"Summing 2 number");

    }
    @Test
    public void multiTest(){
        BasicMath math = new BasicMath();
        int testData1 = 5;
        int testData2 = 7;

        int expectedResultMul = testData1 * testData2;
        int actualResultMul = math.multiply(testData1,testData2);

        Assert.assertEquals(actualResultMul,expectedResultMul);
    }
}