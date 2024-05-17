package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test(groups = {"smoke"})
    public void verifySoftAssert() {
        SoftAssert softassert = new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Kumar\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        WebElement userNameTextBox = driver.findElement(By.id("Login1"));
        softassert.assertEquals(title, "Rediffmail", "Rediffmail title should be match.");
        softassert.assertTrue(userNameTextBox.isDisplayed(), "UserName TextBox should be displayed.");
        softassert.assertAll();
        driver.close();
    }
}