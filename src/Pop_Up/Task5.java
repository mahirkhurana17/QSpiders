package Pop_Up;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task5 {

public static void main(String[] args) throws InterruptedException {
		
		String given_url = "https://www.barbequenation.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///M:/Selenium%20imp%20files/MultipleWindow-1.html");
		
		Actions act = new Actions(driver);
		
		WebElement food_site = driver.findElement(By.xpath("//input[@value='Open Food Sites']"));
		
		Thread.sleep(2000);
		act.moveToElement(food_site).click().build().perform();
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);
		
		for (String s : handles) {
			driver.switchTo().window(s);
			Thread.sleep(2000);
			
			String current_url = driver.getCurrentUrl();
			if (given_url.equals(current_url))
			{
				
			}
		}

}
}
