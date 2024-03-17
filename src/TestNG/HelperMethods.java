package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HelperMethods {

	@Test(priority = 2)
	public void easeMyTrip() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.easemytrip.com/");
		driver.close();
		Reporter.log("EaseMyTrip",true );
	}
	
	@Test(priority = 1, invocationCount = 3, threadPoolSize = 2)
	public void redBus() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		driver.close();
		Reporter.log("RedBus",true );
	}
	
	@Test(priority= 0)
	public void indiaMart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.indiamart.com/");
		driver.close();
		Reporter.log("IndiaMart",true );
	}

}
