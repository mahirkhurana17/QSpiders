package Package1NG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NIke {
	
	@Test(groups = "Performance")
	public void nike() {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.nike.com/in/");
		driver.close();
		
	}
		
		
}
