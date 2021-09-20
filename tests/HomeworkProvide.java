import org.testng.annotations.DataProvider;

import java.util.Arrays;

public class HomeworkProvide {
    //    @DataProvider(name = "userInfo")
//
//        public static Object[][] logInData(){
//        // adding data some of them is null
//        String [][]data =
//                {
//                        {"Game", "Warachai", "1-800-818-9999", "Game@hotmail.com", "Instructor"},
//                        {"John", "Wick", "9-999-999-9999", "Wick@hotmail.com", "Instructor"},
//                        {" ", " ", "1-800-818-9999", "Game@hotmail.com", "Instructor"},
//                        {"Game", "Warachai", " ", "Game@hotmail.com", "Instructor"},
//                        {"Game", "Warachai", "1-800-818-9999", " ", "Instructor"},
//                };
//        // print check the details
//        System.out.println(Arrays.deepToString(data));
//        System.out.println("----------");
//        return data;
//        }
//    }
//  *********************************
    @DataProvider(name = "userInfo")
    public static Object[][] registerUser() {
        Object[][] data = new Object[3][6];
        data[0][0] = "Donald";
        data[0][1] = "Biden";
        data[0][2] = "111-111-1111";
        data[0][3] = "donbid@mail.test";
        data[0][4] = "Mentor";
        data[0][5] = "pass";

        data[1][0] = "Donald";
        data[1][1] = "Biden";
        data[1][2] = "111-111-1111";
        data[1][3] = "";
        data[1][4] = "Student";
        data[1][5] = "fail";

        data[2][0] = "Donald";
        data[2][1] = "Biden";
        data[2][2] = "";
        data[2][3] = "donbid@mail.test";
        data[2][4] = "Instructor";
        data[2][5] = "fail";

        return data;
    }
}
