package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	
	public static void main(String[] args) {
		
		// Register by using x-path
		
		WebDriver mahir = new ChromeDriver();
		
		mahir.manage().window().maximize();
		mahir.get("https://demowebshop.tricentis.com/");
		
		mahir.findElement(By.xpath("//a[@class ='ico-register']"));
		
		//Giving the Credentials
		mahir.findElement(By.xpath("//input[@value='M']"));
		mahir.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Mahir");
		mahir.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Khurana");
		mahir.findElement(By.xpath("//input[@id='Email']")).sendKeys("mk@gmail.com");
		
		mahir.findElement(By.xpath("//input[@id='Password']")).sendKeys("mahir123");
		mahir.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("mahir123");
		
		mahir.findElement(By.xpath("//input[@value='Register']")).click();
		
		
		
		
		
		
	}

}
