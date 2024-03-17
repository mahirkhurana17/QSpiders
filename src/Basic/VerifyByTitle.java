package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByTitle {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Going to Gift Cards & enter Credentials to Buy
		
		WebDriver mahir = new ChromeDriver();
		mahir.manage().window().maximize();
		mahir.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		String[] values =  {"mahir","m@gmail.com","Mahir", "m@gmail.com"};
		
		String title = "Demo Web Shop";
		String current_title = mahir.getTitle();
		System.out.println(current_title);
		
		//Verifying Home Page
		if(current_title.equals(title))
		{
			mahir.findElement(By.xpath("(//input[@value=\"Add to cart\"])[1]")).click();
			Thread.sleep(2000);
			
			//Entered into Gift Cards Page
			String GiftCards_title = "Demo Web Shop. $25 Virtual Gift Card";
			String current_GiftPage = mahir.getTitle();
			
			System.out.println(current_GiftPage);
			System.out.println("Successfull");
			Thread.sleep(3000);
			
			//Verifying Gift cards Page
			if(current_GiftPage.equalsIgnoreCase(GiftCards_title))
			{
				System.out.println("I am inside the Gift cards page");
				
				Thread.sleep(2000);
				List<WebElement> g_values = mahir.findElements(By.xpath("//div[@class='giftcard']/div/input"));
				Thread.sleep(2000);
	//			System.out.println(g_values.size());
				
				int i=0;
				for(WebElement web : g_values) {
					web.sendKeys(values[i++]);
				}
				
				mahir.findElement(By.id("add-to-cart-button-2")).click();
				
			}
			
		}
	}

}
