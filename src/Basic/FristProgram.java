package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FristProgram {

	public static void main(String[] args) {
		
		//open the browser
		WebDriver d = new ChromeDriver();
		
		//maximize
		d.manage().window().maximize();
		
		//enter into the demo web shop page
		d.get("https://demowebshop.tricentis.com/fiction");
		
		//WebElement search_field = d.findElement(By.tagName("input"));
		//search_field.click();
		
		d.findElement(By.className("ico-login")).click();
		d.close();
		
		

	
	
	}

}
