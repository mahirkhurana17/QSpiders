package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver mahir = new ChromeDriver();
		mahir.manage().window().maximize();
		mahir.get("https://demowebshop.tricentis.com/");
		
		String digi_prod_url = "https://demowebshop.tricentis.com/digital-downloads";
		
		mahir.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
	
		String current_url = mahir.getCurrentUrl();
		if(current_url.equals(digi_prod_url))
		{
			// Verifying
			System.out.println("I am in the Digital Downloads page");
			
			//Adding all products
			List<WebElement> links = mahir.findElements(By.xpath("//input[@value='Add to cart']"));
			
		    //Performing Click Action on them
			for(WebElement india: links)
			{
				india.click();
				Thread.sleep(2000);
			}
			
			mahir.findElement(By.xpath("//span[text()='Shopping cart']")).click();
			
			//REMOVING FROM CART
			//Storing them inside a reference variable called checkboxs
			List<WebElement> checkBoxs = mahir.findElements(By.xpath("//input[@name='removefromcart']"));
			 
			Thread.sleep(1500);
			for(WebElement web : checkBoxs)
			{
				web.click();
				Thread.sleep(1500);
			}
		
			mahir.findElement(By.xpath("//input[@name='updatecart']")).click();
		
		}
		
	}

}
