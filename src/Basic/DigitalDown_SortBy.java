package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DigitalDown_SortBy {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		mahir.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		WebElement sort_by = mahir.findElement(By.xpath("//select[@id=\"products-orderby\"]"));
		
		Select s_ref = new Select(sort_by);
		List<WebElement> position = s_ref.getOptions();
		System.out.println("Products");
		int i=0;
		for (WebElement web : position) {
			s_ref.selectByIndex(i++);
			
			Thread.sleep(2000);
			
		}
		
		
	}
}
