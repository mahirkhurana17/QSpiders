package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ClickOnBooks {
	
	public static void main(String[] args) {
		
		WebDriver mahir = new ChromeDriver();	
		
		mahir.manage().window().maximize();
		mahir.get("https://demowebshop.tricentis.com/");
		
		mahir.findElement(By.xpath("//a[contains(text(),'Books')]")).click();
		
		
		
	}

}
