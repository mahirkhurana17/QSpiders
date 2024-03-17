package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///M:/Selenium%20imp%20files/iframe.html");
		
		//1
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		driver.navigate().back();
		
		//2
		 
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
		driver.findElement(By.xpath("//a[text()='Google']")).click();
		
		
		
		
	}
}
