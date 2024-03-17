package JavaScriptExecutor;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.skillrary.com/");
		Thread.sleep(2000);
		String home = driver.getWindowHandle();
		
		WebElement gears = driver.findElement(By.xpath("//span[text()='GEARS']"));
		Actions a = new Actions(driver);
		
		Thread.sleep(2000);
		a.moveToElement(gears);
		
		WebElement demo_page = driver.findElement(By.xpath("//a[contains(text(),'SkillRary Demo APP')]"));
		demo_page.click();
		
		Set<String> handles = driver.getWindowHandles();
		handles.remove(home);
		for (String str : handles) {
			driver.switchTo().window(str);	
		}
		
		
		WebElement hidden_subs = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].value='Mahir'", hidden_subs);
		
		
		
		
		
	}
}
