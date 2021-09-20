import org.testng.annotations.DataProvider;

public class TaskProvideOrange {
        @DataProvider(name = "orangeData")
        public static Object[][] registerUser() {
            Object[][] data = new Object[3][3];
            data[0][0] = "Admin";
            data[0][1] = "admin123";
            data[0][2] = "pass";

            data[1][0] = "Donald";
            data[1][1] = "1111111";
            data[1][2] = "fail";

            data[2][0] = "1111111";
            data[2][1] = "Biden";
            data[2][2] = "fail";

            return data;

    }
}
