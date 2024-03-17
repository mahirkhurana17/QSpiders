package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RadioClick extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		preCondition();
		
		mahir.get("https://demowebshop.tricentis.com/");
		
	//	mahir.findElement(By.id("pollanswers-1")).click();
		//		Thread.sleep(2000);
		//	mahir.findElement(By.id("pollanswers-2")).click();
		//	Thread.sleep(2000);
//	mahir.findElement(By.id("pollanswers-3")).click();
	//	Thread.sleep(2000);
	//	mahir.findElement(By.id("pollanswers-4")).click();
		
	List<WebElement> community_poll = mahir.findElements(By.cssSelector("input[type='radio']"));
	for (WebElement abc : community_poll) {
		abc.click();
		Thread.sleep(2000);
		
		
	
		
		
	}

	
}
}
