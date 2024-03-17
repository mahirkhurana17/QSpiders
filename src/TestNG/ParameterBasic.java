package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterBasic {

	@Parameters({"dUrl","dUrl"})
	@Test
	public void dsw1(String dUrl,String dUrl1)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to(dUrl);
		driver.get(dUrl1);
		driver.quit();
		
	}
	@Parameters("dUrl")
	@Test
	public void dsw2(String dUrl1)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to(dUrl1);
		driver.quit();
		
	}
	
	@Parameters("dUrl")
	@Test
	public void dsw3(String dUrl1)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to(dUrl1);
		driver.quit();
		
	}
	
}
