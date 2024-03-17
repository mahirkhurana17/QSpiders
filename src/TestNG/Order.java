package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Order {
	
	@Test(priority = 97)
	public void easeMyTrip() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.easemytrip.com/");
		driver.close();
		Reporter.log("EaseMyTrip",true );
	}
	
	@Test(priority = 'a')
	public void redBus() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		driver.close();
		Reporter.log("RedBus",true );
	}
	
	@Test (priority = -1)
	public void redBus1() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		driver.close();
		Reporter.log("RedBus 1",true );
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
