package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act = new Actions(driver);
		
		WebElement double_click = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		Thread.sleep(2000);
		act.moveToElement(double_click).doubleClick().build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='right click me']")).click();
		
		Thread.sleep(2000);
		
		try {
			double_click.click();
			System.out.println("My script is Unsuccessfull.......");
		}
		catch(Exception e){
			System.err.println("My script is Successfull........");
			
		}
	}
	
}
	

