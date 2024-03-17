package Package2NG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hero {

	@Test(groups = "Performance")
	public void hero() {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.heromotocorp.com/en-in.html");
		driver.close();
		
	}
}
