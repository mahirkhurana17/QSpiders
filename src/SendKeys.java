import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeys {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demowebshop.tricentis.com/");
		
		WebElement search_field = driver.findElement(By.id("small-searchterms"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(search_field).click().sendKeys("Mahir tshirt").perform();
		Thread.sleep(2000);
		act.keyDown(Keys.TAB).keyDown(Keys.ENTER).build().perform();

	}
}
