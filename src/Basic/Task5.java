package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {

	public static void main(String[] args) {
		
		// Verifying the Given url is same as Current url or not.
		
		String givem_url = "https://demowebshop.tricentis.com/";
		
		WebDriver mahir = new ChromeDriver();
		mahir.manage().window().maximize();
		mahir.get("https://demowebshop.tricentis.com/");
		
		String current_url = mahir.getCurrentUrl();
		
		if(current_url.equals(givem_url))
		{
			System.out.println("I am in DWS page");
			mahir.close();
		}
		else
		System.out.println("I am not in DWS page");
		
		
		
		
	}
}
