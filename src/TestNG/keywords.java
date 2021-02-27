package TestNG;


import org.testng.Assert;
import org.testng.annotations.Test;

public class keywords {

//InvocationCount
	@Test(invocationCount=10)
	public void T1(){
		System.out.println("running TC1");
		}
	

//Priority
@Test(priority=-2) public void T2() {
System.out.println("Running TC1");
}


@Test() public void TC2() {
	System.out.println("Running TC2");
}


//enabled
@Test() public void T3() {
	System.out.println("running TC2");
}

@Test(enabled=false) public void T4() {
	System.out.println("running TC2");
}


//Timeout
@Test(timeOut=5000) public void TC1() throws InterruptedException{
	Thread.sleep(6000);
System.out.println("running TC1");
}


//depends on method
@Test() public void login1() {
	System.out.println("running login1 method");
}
	
	@Test public void login2() {
		Assert.fail();
		System.out.println("running login2 method");
	}

@Test(dependsOnMethods= {"login1","login2"}) public void logout()
{System.out.println("running logout method");  
	}
}


