package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {
	public static void main(String[] args) throws InterruptedException {
		
		String given_data = "Hello! Mahir How are you today";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Alert a = driver.switchTo().alert();
		String cc = "Mahir";
		a.sendKeys(cc);
		a.accept();
		
		String b = driver.findElement(By.id("demo1")).getText();
		
		if(b.contains(cc))
		{
			System.out.println("Script is Passed.");
		}
		
		else {
			System.out.println("The script failed");
		}
		
		
		
		
		
	}

}
