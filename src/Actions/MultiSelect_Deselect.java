package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect_Deselect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Demo = new ChromeDriver();
		Demo.manage().window().maximize();
		//Opening the web app
		Demo.get("M:\\Selenium imp files");
		Demo.findElement(By.xpath("//a[@class='icon up']")).click();
		WebElement s_ref1  = Demo.findElement(By.id("standard_cars"));
		WebElement s_ref2  = Demo.findElement(By.id("multiple_cars"));

		//Now creating select class objects for each dropdown
		Select single = new Select(s_ref1);
		Select multi = new Select(s_ref2);

		// Compare and select multiple and deselect the mulpti select dorpdknw
		if (single.isMultiple()) {
			System.out.println("This is a Multi select Dropdown");
			single.deselectByIndex(5);
		}
		else if (multi.isMultiple()){
			System.out.println("This is a Multi select Dropdown");
			List<WebElement> brands= multi.getOptions();
			for (WebElement select : brands) {
				select.click();
				Thread.sleep(2000);

			}
			System.out.println("Now We are Deselecting all");
			Thread.sleep(2000);
			multi.deselectAll();
		}

	}

}

