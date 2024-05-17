package testng.annotations;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {

    @Test(groups = {"smoke"})
    public void verifyNewHomeLogin(){
        Assert.assertTrue(false);
        System.out.println("Verify New Home Login");
    }

    @Test(dependsOnGroups = {"smoke"})
    public void verifyLMS(){
        System.out.println("Loan Management System");
    }

    @Test(enabled = false)                           //test case is not run ,default is true
    public void verifyCardManagementSystem(){
        System.out.println("Verify Card Management System");
    }
}