package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElementSS {
	public static void main(String[] args) throws IOException {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	//Implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://demowebshop.tricentis.com/digital-downloads");
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	File from = ts.getScreenshotAs(OutputType.FILE);
	File to = new File("M:\\Selenium imp files\\Electronic.png");
	
	FileHandler.copy(from, to);
	
	
	
	}
}
