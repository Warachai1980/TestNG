import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;


public class SeleniumTest {
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

    @Test(testName = "Google Title test", description = "Testing if title is 'Google'")
    public void test1(Method method){
        driver.get("https://google.com/");
        Assert.assertEquals(driver.getTitle(), "Google");

        Test testDetails = method.getAnnotation(Test.class);
        System.out.println(testDetails.testName());
        System.out.println(testDetails.description());
        System.out.println(method.getName());
    }
    @Test(enabled = false)
    public void testAmazonTitle() {
        driver.get("https://www.amazon.com/");

        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Test(priority = 2)
    public void testTLA() {
        driver.get("http://automation.techleadacademy.io/#/alert");

        driver.findElement(By.linkText("Alert")).click();

        String expected = "http://automation.techleadacademy.io/#/alert";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);

    }

    @Test(invocationCount = 2)
    public void testOrbitz() {
        driver.get("https://www.orbitz.com/");
        Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Sign in']")).isEnabled());

    }
    @Test(testName = "Saucelabs Log in option", dataProvider = "loginData", dataProviderClass = DataProviders.class)
    public void test02(String username, String password){
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        Assert.assertEquals(driver.findElement(By.xpath("//*[@class='title']")).getText(), "PRODUCTS");

    }
}