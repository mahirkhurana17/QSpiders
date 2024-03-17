package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	
	public static void main(String[] args) throws InterruptedException {
		//Open the Browser
		ChromeDriver mahir = new ChromeDriver();
		
		mahir.manage().window().maximize();
		mahir.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		mahir.findElement(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		mahir.close();
		
	}

}
