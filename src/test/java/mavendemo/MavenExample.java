package mavendemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenExample {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Kumar\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.close();
    }
}
/*   <methods>
           <include name="basicOfTestNG1"/>
           <include name="basicOfTestNG2"/>
           <include name="testCase1"/>
           <include name="testCase2"/>
               <include name="annotationMethod1"/>
               <include name="annotationMethod2"/>
               <include name="verifyCardManagementSystem"/>
               <include name="verifyLogin"/>
               <include name="verifyHomePage"/>
               <include name="verifyFundTransfer"/>
               <include name="priorityDemo_B"/>
               <include name="priorityDemo_G"/>
               <include name="priorityDemo_K"/>
               <include name="priorityDemo_P"/>
               <include name="priorityDemo_Z"/>
               <include name="priorityDemo_O"/>
               <include name="priorityDemo_F"/>
               <include name="priorityDemo_N"/>
               <include name="priorityDemo_I"/>
               <include name="priorityDemo_H"/>
               <include name="priorityDemo_A"/>
               <include name="priorityDemo_Y"/>
       </methods>-->*/