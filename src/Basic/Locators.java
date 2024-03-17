package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
  
public class Locators {
	
	public static void main(String[] args) {
		
		 WebDriver d = new ChromeDriver(); 
		 
		 d.manage().window().maximize();
		 
		 d.get("https://demowebshop.tricentis.com/");

//		 WebElement search_field = d.findElement(By.tagName("input"));
		 
//		 search_field.click();	
		 
		 d.findElement(By.className("ico-login")).click();
		 d.close();
		
	}

}
