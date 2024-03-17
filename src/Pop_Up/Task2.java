package Pop_Up;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task2 {

public static void main(String[] args) throws InterruptedException {
		
		String given_data = "https://www.olivegarden.com/home";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///M:/Selenium%20imp%20files/MultipleWindow-1.html");
		
		Actions act = new Actions(driver);
		
		WebElement food_site = driver.findElement(By.xpath("//input[@value='Open Food Sites']"));
		
		Thread.sleep(2000);
		act.moveToElement(food_site).click().build().perform();
		Thread.sleep(5000);
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		//switching
		for (String s : handles) {
			
			driver.switchTo().window(s);
			Thread.sleep(2000);
			
			String current_data = driver.getCurrentUrl();
			if(current_data.equals(given_data))
			{
				Thread.sleep(5000);
				driver.manage().window().maximize();
			}
			
		}
		
}
}
