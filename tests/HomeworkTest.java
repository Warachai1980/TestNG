import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Objects;

public class HomeworkTest {
    WebDriver driver = null;

    // Before method
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/games/Desktop/Selenium/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    // After method
    @AfterMethod
    public void tearDown() {
        driver.close();
    }
    // Testing
    @Test(testName = "Register New User", dataProvider = "userInfo", dataProviderClass = HomeworkProvide.class)
    public void test02(String firstName, String lastName, String phoneNumber, String email, String role, String expected){
        driver.get("http://automation.techleadacademy.io/#/usermgt");

        List<WebElement> allTrPre = driver.findElements(By.xpath("//tr"));

        driver.findElement(By.id("Firstname")).sendKeys(firstName);
        driver.findElement(By.id("Lastname")).sendKeys(lastName);
        driver.findElement(By.id("Phonenumber")).sendKeys(phoneNumber);
        driver.findElement(By.id("Email")).sendKeys(email);

        Select select = new Select(driver.findElement(By.id("Select-role")));
        select.selectByVisibleText(role);

        driver.findElement(By.id("submit-btn")).click();

        List<WebElement> allTrPost = driver.findElements(By.xpath("//tr"));

        System.out.println("Pre: " + allTrPre.size() + " | Post: " + allTrPost.size());

        if(expected.equals("pass")) {
            Assert.assertTrue(allTrPost.size() == allTrPre.size() + 1);
        }else if(expected.equals("fail")){
            Assert.assertTrue(allTrPost.size() == allTrPre.size());
        }
    }
}