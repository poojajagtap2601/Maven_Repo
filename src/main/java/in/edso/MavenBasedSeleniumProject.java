package in.edso;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenBasedSeleniumProject {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Kumar\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.close();
        }
    }
