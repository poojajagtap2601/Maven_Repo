package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
    @Test(groups = {"smoke"})
    public void annotationMethod1() {

        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Kumar\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        String title = driver.getTitle();
        WebElement userNameTextBox = driver.findElement(By.id("Login1"));
        Assert.assertEquals(title,"Rediffmail","Rediffmail title should be match.");
        Assert.assertTrue(userNameTextBox.isDisplayed(),"UserName TextBox should be displayed.");
        System.out.println("Hello, Pooja");
    }
}