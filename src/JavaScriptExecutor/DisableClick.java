package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableClick {

	public static void main(String[] args) {
		
		String given_url = "https://login.oracle.com/mysso/signon.jsp";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
		WebElement windows64 = driver.findElement(By.linkText("jdk-11.0.21_windows-x64_bin.exe"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(false);", windows64);
		windows64.click();
		
		WebElement disable = driver.findElement(By.linkText("Download jdk-11.0.21_windows-x64_bin.exe"));
		js.executeScript("arguments[0].click();", disable);
		
		String current_url = driver.getCurrentUrl();
		if(current_url.equalsIgnoreCase(given_url))
		{
			System.out.println("My script is Successfull......");
			driver.close();
		}
		else 
		{
			System.out.println("My Script is not successfull......");
		}
		
	
		
	}
}
