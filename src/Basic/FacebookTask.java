package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTask {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver mahir = new ChromeDriver();
		
		mahir.manage().window().maximize();
		
		mahir.get("https://www.facebook.com/");
		Thread.sleep(2000);
	
		// Verifying
		String fb_url = "https://www.facebook.com/";
		
		String current_url = mahir.getCurrentUrl();
	
		if(current_url.equals(fb_url))
		{
			// Click SignUp
			mahir.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
			
			mahir.findElement(By.cssSelector("//input[name=\"firstname\"]")).sendKeys("Maheer");
			mahir.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("Khurana");
			mahir.findElement(By.id("u_2_g_a0")).sendKeys("9123456789");
			mahir.findElement(By.name("reg_passwd__")).sendKeys("Mahir123");
			mahir.findElement(By.xpath("//input[@value=\"2\"]")).click();
			
			WebElement birthday_day = null;
			// Dropdown Selection 1
			Select m1 = new Select(birthday_day);
			
			Thread.sleep(2000);
			m1.selectByIndex(18);
			
			WebElement birthday_month = null;
			// Dropdown Selection 2
			Select m2 = new Select(birthday_month);
			
			Thread.sleep(2000);
			m2.selectByVisibleText("Dec");
			
			WebElement birthday_year = null;
			// Dropdown Selection 2
			Select m3 = new Select(birthday_year);
			
			Thread.sleep(2000);
			m3.selectByValue("2000");
			
			// Clicking Signup 
	//		mahir.findElement(By.xpath(current_url));
			
			
			
			
			
			
			
		}
	}

}
