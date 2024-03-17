package Pop_Up;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleHandlings {
	public static void main(String[] args) throws InterruptedException {
		
		String given_data = "https://www.facebook.com/nopCommerce";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(2000);
		
		Set<String> childs = driver.getWindowHandles();
		
		System.out.println(childs);
		
		for (String str : childs) {
			driver.switchTo().window(str);
			Thread.sleep(2000);
			String current_data = driver.getCurrentUrl();
			if(given_data.equals(current_data))
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@id=':rb:']")).sendKeys("Jai Shree Ram");
				
			}
			Thread.sleep(2000);
		}
		
		
	}

}
