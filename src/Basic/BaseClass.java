package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	//declaring the web driver Globally
	public static WebDriver mahir;
	

	public static void preCondition() {
		mahir = new ChromeDriver();
		mahir.manage().window().maximize();
		
	}

	public static void preCondition1() {
		mahir = new EdgeDriver();
		mahir.manage().window().maximize();	
	}
	
	public static void preCondition2() {
		mahir = new FirefoxDriver();
		mahir.manage().window().maximize();	
	}
	
	public static void postCondition() {
		mahir.close();
	}

	public static void postCondition1() {
		mahir.quit();
	}
	
	

}
