package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarForAgoda {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.agoda.com/");
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();
		
		driver.findElement(By.xpath("//div[@class='SearchBoxTextDescription__title']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@data-selenium-date='2024-03-24']")).click();
		Thread.sleep(1000);
		
		for(;;)
		{
			try {
				driver.findElement(By.xpath("//span[@data-selenium-date='2024-06-20']")).click();				
				break;
			}
			catch(Exception e)
			{
				driver.findElement(By.xpath("//button[@aria-label='Next Month']")).click();
			}
		}
	}

}
