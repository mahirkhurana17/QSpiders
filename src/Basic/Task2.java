package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
	public static void main(String[] args) {
		
		// Task - Register & Login
		
		WebDriver mahir = new ChromeDriver();
		
		mahir.manage().window().maximize();
		
		mahir.get("https://demowebshop.tricentis.com/");
		
		mahir.findElement(By.className("ico-register")).click();
	
		// Filling Credentials
		mahir.findElement(By.id("gender-male")).click();
		mahir.findElement(By.name("FirstName")).sendKeys("Mahir");
		mahir.findElement(By.id("LastName")).sendKeys("Khurana");
		mahir.findElement(By.name("Email")).sendKeys("17mahirkhurana@gmail.com");
		mahir.findElement(By.id("Password")).sendKeys("mahir123");
		mahir.findElement(By.id("ConfirmPassword")).sendKeys("mahir123");
		
		//Clicking on Register
		mahir.findElement(By.name("register-button")).click();
		
		//---------------------------------------------------------------------------------------
		// Log Out
		
		
	//	-------------------------------------------------------------------------------------
		// Logging in
		
		mahir.findElement(By.className("ico-login")).click();
		
		mahir.findElement(By.cssSelector("input[autofocus='autofocus']")).sendKeys("17mahirkhurana@gmail.com");
		mahir.findElement(By.cssSelector("input[type='password']")).sendKeys("mahir123");
		
		mahir.findElement(By.id("RememberMe")).click();
		
		mahir.findElement(By.className("button-1 login-button")).click();
		
		
	}

}
