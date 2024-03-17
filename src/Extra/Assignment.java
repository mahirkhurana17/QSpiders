package Extra;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {

		//Opening the Browser
		WebDriver driver = new ChromeDriver();

		//Maximize
		driver.manage().window().maximize();

		//Enter url
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(3000);

		//Adding Product 1
		driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@onclick='addToCart(1)']")).click();
		Thread.sleep(3000);

		Alert a = driver.switchTo().alert();

		a.accept();


		driver.findElement(By.xpath("//a[contains(text(),'Home ')]")).click();
		Thread.sleep(3000);

		//Adding Product 2
		driver.findElement(By.xpath("//a[text()='Nokia lumia 1520']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@onclick='addToCart(2)']")).click();
		Thread.sleep(3000);

		Alert b = driver.switchTo().alert();

		b.accept();

		driver.findElement(By.xpath("//a[contains(text(),'Home ')]")).click();
		Thread.sleep(3000);

		//Adding Product 3
		driver.findElement(By.xpath("//a[text()='Sony vaio i5']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@onclick='addToCart(8)']")).click();
		Thread.sleep(3000);

		Alert c = driver.switchTo().alert();

		c.accept();

		//Going Inside Cart
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		Thread.sleep(3000);

		//Verifying total price
		driver.findElement(By.id("totalp"));
		Thread.sleep(3000);

		//Removing 1st added Product from Cart
		driver.findElement(By.xpath("(//a[text()='Delete'])[3]")).click();
		Thread.sleep(3000);

		//Verifying total price
		driver.findElement(By.id("totalp"));
		Thread.sleep(3000);

		//Closing Browser
		driver.close();


	}
}
