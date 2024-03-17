package SeleniumWaiting;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisibilityAndClickability {
	
	public static void main(String[] args) throws InterruptedException {  
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	
		//1
		WebElement fb = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']")));
		
		fb.click();
		Thread.sleep(3000);
		driver.navigate().back();
		
		//2
		WebElement btn3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='timerButton']")));
		btn3.click();
		Thread.sleep(3000);
		
		Alert a = driver.switchTo().alert();
		a.accept();
	}

}
