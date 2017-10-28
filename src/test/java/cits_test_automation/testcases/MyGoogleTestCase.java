package cits_test_automation.testcases;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;
/*
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
*/
import cits_test_automation.AppDemo;

public class MyGoogleTestCase {
	//@Test
	public void f() {
	}
	//@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test..");
	}

	//@AfterTest
	public void afterTest() {
		System.out.println("After Test..");
	}


	//@Test
	public void test() {
		System.out.println("Executing Testcase 1...");
		AppDemo d = new AppDemo();
		String s =  d.testSomething();
		assertEquals("Hello World", s);
		//fail("Not yet implemented");
	}

	//@Test
	public void test1() {
		System.out.println("Executing Testcase 2...");

		/*
		WebDriver d = new FirefoxDriver();
		d.get("http://www.google.com");
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.close();*/
	}


}
