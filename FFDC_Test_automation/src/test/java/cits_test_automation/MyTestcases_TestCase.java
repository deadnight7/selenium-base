package cits_test_automation;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
/*
import javax.sql.rowset.WebRowSet;*/






import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class MyTestcases_TestCase {
	
	@Test
	public void test() {
		System.out.println("***Executing Testcase 1...");
		AppDemo d = new AppDemo();
		String s =  d.testSomething();
		assertEquals("Hello World", s);
		//fail("Not yet implemented");
	}
	
	@Test
	public void test1() {
		System.out.println("***Executing Testcase 2...");

		DesiredCapabilities caps = DesiredCapabilities.firefox();
		caps.setPlatform(Platform.WINDOWS);
		String u = "http://sdaas-gridlab.cisco.com:8080/wd/hub";
		WebDriver d = null;
		try {
			d = new RemoteWebDriver(new URL(u), caps);
			System.err.println("Using Remote Grid : "+u);
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.err.println("Unable to Initiate URL "+u);
		}
		d.get("http://www.google.com");
		System.out.println("***Browser launched...");
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.close();
		System.out.println("Browser closed...");
		System.out.println("***Test 2 Completed...");
	}
	
}
