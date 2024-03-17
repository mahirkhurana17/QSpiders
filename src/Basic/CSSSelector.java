package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {
	
public static void main(String[] args) {
		
		WebDriver mahir = new ChromeDriver();
		
		mahir.manage().window().maximize();
		
		mahir.get("https://demowebshop.tricentis.com/");
		
		mahir.findElement(By.cssSelector("input[type='text']")).sendKeys("Pen");
		mahir.findElement(By.cssSelector("input[type='submit']")).click();
		mahir.close();
		
		
}
		
		
	  	
		

}
