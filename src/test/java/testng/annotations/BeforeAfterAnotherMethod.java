package testng.annotations;
import org.testng.annotations.*;

public class BeforeAfterAnotherMethod {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @BeforeClass
    public void beforeClassDemo(){
        System.out.println("Before Class");
    }
    @AfterClass
    public void afterClassDemo(){
        System.out.println("After Class");
    }
    @BeforeMethod
    public void beforeMethodDemo(){
        System.out.println("Before Method");
    }
    @Test
    public void testCase1(){
        System.out.println("test case 1");
    }
    @Test
    public void testCase2(){
        System.out.println("test case 2");
    }
    @AfterMethod
    public void afterMethodDemo(){
        System.out.println("After Method");
    }
}