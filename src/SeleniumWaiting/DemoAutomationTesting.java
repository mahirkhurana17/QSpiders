package SeleniumWaiting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAutomationTesting {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Mahir");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Khurana");
		
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("m@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9999999999");
		
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		
//		WebElement Lang = driver.findElement(By.id("msdd"));
//		Lang.click();
//		Select s = new Select(Lang);
//		
//		s.selectByVisibleText("English");
//		s.selectByVisibleText("Hindi");
		
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.xpath("//a[text()='English']").
		
		
		//Skills
		WebElement s2 = driver.findElement(By.id("Skills"));
		s2.click();
		Select s = new Select(s2);
		
		s.selectByVisibleText("Java");
		Thread.sleep(1000);
		s.selectByVisibleText("C++");
		
		//Country
		WebElement c = driver.findElement(By.id("countries"));
		c.click();
		Select c1 = new Select(c);
		
		c1.selectByVisibleText("India");
		
		//DOB
		//Year
		WebElement y = driver.findElement(By.id("yearbox"));
		y.click();
		Select y1 = new Select(y);
		
		y1.selectByVisibleText("2000");
		
		//Month
		WebElement m = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		y.click();
		Select m1 = new Select(m);
		
		m1.selectByVisibleText("December");
		
		//Date
		WebElement d = driver.findElement(By.id("daybox"));
		y.click();
		Select d1 = new Select(d);
		
		y1.selectByVisibleText("17");
		
		//Password
		driver.findElement(By.id("firstpassword")).sendKeys("Mahir123");
		
		driver.findElement(By.id("secondpassword")).sendKeys("Mahir123");
		
		driver.findElement(By.id("submitbtn")).click();
		

		
		
	}

}
