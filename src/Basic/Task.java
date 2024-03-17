package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		
		WebDriver mahir = new ChromeDriver();
		
		mahir.manage().window().maximize();
		
		mahir.get("https://demowebshop.tricentis.com/");
		
		mahir.findElement(By.className("ico-register")).click();
	
		// Filling Credentials
		mahir.findElement(By.id("gender-male")).click();
		mahir.findElement(By.name("FirstName")).sendKeys("Mahir");
		mahir.findElement(By.id("LastName")).sendKeys("Khurana");
		mahir.findElement(By.name("Email")).sendKeys("mahirkhurana17@gmail.com");
		mahir.findElement(By.id("Password")).sendKeys("mahir123");
		mahir.findElement(By.id("ConfirmPassword")).sendKeys("mahir123");
		
		//Clicking on Register
		mahir.findElement(By.name("register-button")).click();
		
		
		
	
		
		
		
	}
}
