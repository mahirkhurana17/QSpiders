package Assertions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Task {

	@Test
	public void dws()
	{
		String expected_result = "https://demowebshop.tricentis.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");
		String actual_result = driver.getCurrentUrl();

		assertEquals(expected_result, actual_result);

		//SoftAssert sa = new SoftAssert();
		//sa.assertEquals(expected_result, actual_result, "It is not Matching");
		driver.findElement(By.id("small-searchterms")).isEnabled();
		driver.findElement(By.id("small-searchterms")).sendKeys("Book");

		driver.findElement(By.xpath("//input[@type='submit']")).isEnabled();
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}
}
