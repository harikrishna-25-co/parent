package seleniumtestcases;

import org.testng.annotations.Test;

import seleniumframework.Base;
import seleniumpages.AmazonPage;

public class AmazonTest extends Base{

	@Test
	public void amazon()  {
		
		driver.get("https://www.amazon.ca");
		
		AmazonPage amazon=new AmazonPage(driver);
		
		amazon.searchBar();
		
		amazon.selectingMobile();
		
		amazon.addingToCart();
		
		amazon.checkOut();
		
	}
	
}
