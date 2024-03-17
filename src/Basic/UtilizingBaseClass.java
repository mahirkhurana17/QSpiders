package Basic;


public class UtilizingBaseClass extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread.sleep(3000);
		
		
		preCondition();
		mahir.get("https://demowebshop.tricentis.com/");
		postCondition1();
		
		preCondition1();
		mahir.get("https://demowebshop.tricentis.com/");
		postCondition();
		
		preCondition2();
		mahir.get("https://demowebshop.tricentis.com/");
		postCondition();
		
		
		
	}
	

}
