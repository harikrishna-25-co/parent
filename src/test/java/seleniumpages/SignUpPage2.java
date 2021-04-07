package seleniumpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage2 {

	WebDriver driver;
	
	
	
	By firstName= By.name("firstname");
	
	By lastName= By.name("lastname");
	
	By number= By.name("reg_email__");
	
	By password = By.id("password_step_input");
	
	By month= By.id("month");
	
	By day= By.id("day");
	
	By year= By.id("year");
	
	By sex= By.name("sex");
	
	
    public SignUpPage2(WebDriver driver) {
		this.driver=driver;
		//PageFactory.initElements(driver, LoginPage.class);
	}
	
	public void firstName() {
		
		//driver.findElement(firstName).sendKeys("michael");
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys("Micheal");
		
	}
	
	public void lastName() {
		
		driver.findElement(lastName).sendKeys("Jordan");
	}
	
	public void phoneNumber() {
		
		driver.findElement(number).sendKeys("9999999999");
	}
	
	public void password() {
		
		driver.findElement(password).sendKeys("3456784567");
	}
	
	public void month() {
		
		Select drpMonth = new Select(driver.findElement(month));
		drpMonth.deselectByVisibleText("Jan");
		
	}
	
	public void day() {
		
		Select drpDay= new Select(driver.findElement(day));
		
		drpDay.selectByVisibleText("6");
		
	}
	public void year() {
		
		Select drpYear= new Select(driver.findElement(year));
		
		drpYear.selectByVisibleText("2012");
	}
	
	public void sexGender() {
		
		WebElement radioSex= driver.findElement(sex);
		radioSex.click();
	}
	
	
}
