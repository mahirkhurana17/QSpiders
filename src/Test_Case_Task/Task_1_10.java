package Test_Case_Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_1_10 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//1
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//2
		driver.get("https://shoppersstack.com/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		//3
		WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginBtn")));
		Thread.sleep(2000);
		
		loginBtn.click();
		
		//4
		driver.findElement(By.id("vertical-tab-0")).click();
		Thread.sleep(2000);
		
		//5
		driver.findElement(By.xpath("//span[text()='Create Account']")).click();
		Thread.sleep(2000);
		
		//6
		WebElement signIn = driver.findElement(By.id("signIn"));
		
		Actions a = new Actions(driver);
		
			// Verifying Hover
			a.moveToElement(signIn).build().perform();
			Thread.sleep(2000);
			
			
		//7
		wait.until(ExpectedConditions.elementToBeClickable(signIn));
		
		signIn.click();
		
		//8   Pending
		
		
		
		
		//9
		driver.findElement(By.id("First Name")).click();
		
		
		//10	Pending
		
		
		
		//11	Pending
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
