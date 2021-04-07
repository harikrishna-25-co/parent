package seleniumtestcases;

import org.testng.annotations.Test;

import seleniumframework.Base;
import seleniumpages.LoginPage;

public class FacebookLoginTest extends Base {

	@Test()
	public void FacebookRegisterTest() {
		
		driver.get("http://www.facebook.com");
		
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.clickNewAccount();
		
		loginpage.clickLoginButton();
		
	}
	
}
