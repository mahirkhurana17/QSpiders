package Basic;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsMethod {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver mahir = new ChromeDriver();
		
		mahir.manage().window().maximize();
		
		mahir.get("");
		
		WebElement single_dropDownMenu = mahir.findElement(By.id("standard_cars"));
		Select s_ref = new Select(single_dropDownMenu);
		
		List<WebElement> cars = s_ref.getOptions();
		System.out.println(cars);
		int i=0;
		for (WebElement web : cars) {
			s_ref.selectByIndex(i++);
			
			Thread.sleep(2000);
			
		}
		
	}

}
