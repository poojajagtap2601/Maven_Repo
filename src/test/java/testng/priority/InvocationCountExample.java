package testng.priority;

import org.testng.annotations.Test;

public class InvocationCountExample {
    @Test(invocationCount = 5000, invocationTimeOut = 1)
        public void invocationCountDemo(){
        System.out.println("Invocation Count Demo");
    }
}
