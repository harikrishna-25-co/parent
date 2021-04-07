package seleniumtestcases;

import org.testng.annotations.Test;

import seleniumframework.Base;
import seleniumpages.LoginPage;
import seleniumpages.SignUpPage;

public class FacebookSignUpTest extends Base {

	@Test
	public void facebookSignUp() {
		
		driver.get("https://www.facebook.com");
		
		LoginPage loginpage= new LoginPage(driver);
		
		loginpage.clickNewAccount();
		
		SignUpPage signup=new SignUpPage(driver);
		
		
		signup.firstName();
		
		signup.lastName();
		
		signup.phoneNumber();
		
		signup.password();
		
		signup.month();
		
		signup.day();
		
		signup.year();
		
		signup.sexGender();
		
		
	}
	
}
