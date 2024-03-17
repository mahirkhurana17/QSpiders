package Pop_Up;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		
		String given_data = "file:///C:/Users/Dell/Downloads/MultipleWindow-1.html";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///M:/Selenium%20imp%20files/MultipleWindow-1.html");
		
		Actions act = new Actions(driver);
		
		WebElement food_site = driver.findElement(By.xpath("//input[@value='Open Food Sites']"));
		
		act.moveToElement(food_site).click().build().perform();
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		String current_data = driver.getCurrentUrl();
		
		//switching
		for (String s : handles) {
		
			if(current_data.equalsIgnoreCase(given_data))
			{
				System.out.println("Parent window is Opened");
				Thread.sleep(3000);
			}
		
			
//			driver.switchTo().window(s);
//			Thread.sleep(2000);
			
			else
			{
				driver.switchTo().window(s);
				Thread.sleep(3000);
				driver.close();
			}
			
		}
		
		
		
		
		
		
		
		
		
	}
}
