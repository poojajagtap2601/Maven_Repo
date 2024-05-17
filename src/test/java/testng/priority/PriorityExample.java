package testng.priority;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityExample {
    @Test                                      //Default priority is 0
    public void priorityDemo_B(){
        System.out.println("priorityDemo_B");
    }
    @Test(priority = 'A')                                 //execute last bcoz ASCII value
    public void priorityDemo_G(){
        System.out.println("priorityDemo_G");
    }
    @Test(priority = -1)
    public void priorityDemo_K(){
        System.out.println("priorityDemo_K");
    }
    @Test(priority = -8, groups = {"smoke"})                      //First execute negative no. then positive no
    public void priorityDemo_P(){
        System.out.println("priorityDemo_P");
    }

    @Test(priority = 1)                         //same priority then execute alphabet wise
    public void priorityDemo_Z(){
        System.out.println("priorityDemo_Z");
    }

    @Test(priority = 1)
    public void priorityDemo_O(){

        System.out.println("priorityDemo_O");
    }

    @Test(priority = 2)
    public void priorityDemo_F(){
        Assert.assertTrue(false);
        System.out.println("priorityDemo_F");
    }

    @Test(priority = 3)
    public void priorityDemo_N(){
        System.out.println("priorityDemo_N");
    }

    @Test(priority = 4)
    public void priorityDemo_I(){
        System.out.println("priorityDemo_I");
    }

    @Test(priority = 5)
    public void priorityDemo_H(){
        System.out.println("priorityDemo_H");
    }

}
