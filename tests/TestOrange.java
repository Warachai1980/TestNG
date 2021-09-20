import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestOrange {
        WebDriver driver = null;

        @BeforeMethod
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "/Users/games/Desktop/Selenium/drivers/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test(testName = "Orange HRM", dataProvider = "orangeData", dataProviderClass = TaskProvideOrange.class)
    public void test(String username, String password, String expected) {

        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

        driver.findElement(By.xpath("//input[@name = 'txtUsername']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name = 'txtPassword']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@class='button']")).click();

        String expectedUrl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        String actualUrl = driver.getCurrentUrl();

        if(expected.equals("pass")) {
            Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
        }else if(expected.equals("fail")){
            Assert.assertEquals(driver.findElement(By.xpath("//span[@id='spanMessage']")).getText(),"Invalid credentials");
        }
    }
}
