package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeTest(alwaysRun=true)
	public void method3()
	{
		System.out.println("This method executes before All Testcases-Method 3");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void method1()
	{
		System.out.println("Inside before Method1");
	}
	
	@AfterMethod(alwaysRun=true)
	public void method2()
	{
		System.out.println("Inside after method");
	}
	
	@AfterTest(alwaysRun=true)
	public void method4()
	{
		System.out.println("Executes after all the testcases-Method4");
	}
}
