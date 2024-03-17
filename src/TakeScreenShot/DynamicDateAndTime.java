package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DynamicDateAndTime {
	
	public static void main(String[] args) throws IOException {
		
		LocalDateTime date = LocalDateTime.now();
		String time = date.toString().replace(":", "-");
		
		System.out.println(time);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		
		
		// We have attached Time so that we can get a different screenshot and we can differentiate it later
		File to = new File("M:\\Selenium imp files\\DigitelDownload"+time+".png");
		
		FileHandler.copy(from, to);
		
		
		
		
	}

}
