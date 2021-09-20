public class BasicMath {
//    public static void main(String []args){
//
//        BasicMath math = new BasicMath();
//       int testData1 = 15;
//       int testData2 = 4;
//
//       int expectedResultSum = testData1 + testData2;
//       int actualResultSum = math.sum(testData1, testData2);
//        System.out.println(expectedResultSum +" | "+actualResultSum);
//        if(expectedResultSum == actualResultSum){
//            System.out.println("Sum is Passed");
//        }else{
//            System.out.println("Sum is Failed");
//        }
//
//        int expectedResultSub = testData1 - testData2;
//        int actualResultSub = math.subtract(testData1,testData2);
//        System.out.println(expectedResultSub +" | "+actualResultSub);
//        System.out.println(expectedResultSub == actualResultSub);
//
//        double testDataD1 = 15.0;
//        double testDataD2 = 4.0;
//        double expectedResultDiv = testDataD1 / testDataD2;
//        double actualResultDiv = math.divide(testDataD1,testDataD2);
//        System.out.println(expectedResultDiv +" | "+actualResultDiv);
//        System.out.println(expectedResultDiv == actualResultDiv);
//
//        int expectedResultMul = testData1 * testData2;
//        int actualResultMul = math.multiply(testData1,testData2);
//        System.out.println(expectedResultMul +" | "+actualResultMul);
//        System.out.println(expectedResultMul == actualResultMul);
//    }

    // if we don't have main method we need to create the testNg
    public int sum(int num1, int num2){
        int total = num1 + num2;
        return total;
    }
    public int subtract(int num1, int num2){
            int total = num1 - num2;
            return total;
    }
    public double divide(double num1, double num2){
        double total = num1 / num2;
        return total;
    }
    public int multiply(int num1, int num2){
        int total = num1 * num2;
        return total;
    }
}
