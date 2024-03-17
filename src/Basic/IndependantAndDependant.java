package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndependantAndDependant {

	public static void main(String[] args) {
		
		String given_url = "https://demowebshop.tricentis.com/digital-downloads";
		
		WebDriver mahir = new ChromeDriver();
		mahir.manage().window().maximize();
		mahir.get("https://demowebshop.tricentis.com/digital-downloads");
		
		if(given_url.equalsIgnoreCase(mahir.getCurrentUrl())) {
			System.out.println("I am in the Digital Products page");
			
			WebElement price = mahir.findElement(By.xpath("(//a[text()='Music 2'])[4]/../../div[3]/div/span"));
			System.out.println(price.getText());
		}
		
		else {
			System.out.println("Entering into Digital Products page in Unsuccessful");
		}
		
	
	}
}
