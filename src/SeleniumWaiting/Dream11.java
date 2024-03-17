package SeleniumWaiting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");

		// by index
		//	driver.switchTo().frame(0);

		// by id
		//	driver.switchTo().frame("send-sms-iframe");

		// by Webelement
//		WebElement a = driver.findElement(By.id("send-sms-iframe"));
//		driver.switchTo().frame(a);
//		driver.findElement(By.id("regEmail")).sendKeys("9876543210");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.)
	}

}
