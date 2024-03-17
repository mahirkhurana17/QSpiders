package Basic;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_StaleElement {
	public static void main(String[] args) {
		
	
	
	WebDriver mahir = new ChromeDriver();
	
	mahir.manage().window().maximize();
	
	mahir.get("https://demowebshop.tricentis.com/");
	
	WebElement digital_download = mahir.findElement(By.xpath("//a[contains(text(),'Digital downloads')]"));
	if(digital_download.isDisplayed())
	{
		System.out.println("My script is successfull.............");
		
	}
	else
	{
		System.out.println("My script is unsuccessfull............");
	}
	
	}

}
