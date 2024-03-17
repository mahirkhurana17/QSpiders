package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		
		WebElement src3 = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement tar3 = driver.findElement(By.xpath("//div[text()='United States']"));
		Thread.sleep(2000);
		
		WebElement src6 = driver.findElement(By.id("box6"));
		WebElement tar6 = driver.findElement(By.xpath("//div[@id='box106']"));
		Thread.sleep(2000);
		
		act.dragAndDrop(src3, tar3).build().perform();
		act.dragAndDrop(src6, tar6).build().perform();
		
		
		
		
		
	}
}
