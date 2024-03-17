package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver mahir = new ChromeDriver();
		
		mahir.manage().window().maximize();
		mahir.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1500);
		
        List<WebElement> links = mahir.findElements(By.xpath("html/body/div[4]/div/div/div[2]/div/ul/li/a"));
        
		for()
	}

}
