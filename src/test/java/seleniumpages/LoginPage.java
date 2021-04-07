package seleniumpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	By loginButton = By.name("login");

	By newAccount = By.linkText("Create New Account");

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	public void clickNewAccount() {

		 driver.findElement(newAccount).click();

		
	}

	public void clickLoginButton() {

		driver.findElement(loginButton).click();
	}

}
