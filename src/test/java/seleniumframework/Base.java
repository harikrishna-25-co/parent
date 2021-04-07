package seleniumframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Base {

	protected WebDriver driver;

	@BeforeMethod(groups = "TEST SMOKE")
	public void beforeMethod() {

		Reporter.log("beforemethod", true);

		System.setProperty("WebDriver.Chrome.Driver", "ChromeDriver");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@AfterMethod(groups = "TEST SMOKE")
	public void afterMethod() {

		Reporter.log("afterMethod", true);

		driver.quit();
	}

	@BeforeClass(groups = "TEST SMOKE")
	public void beforeClass() {

		Reporter.log("beforeClass", true);

	}

	@AfterClass(groups = "TEST SMOKE")
	public void afterclass() {

		Reporter.log("afterclass", true);
	}

	@BeforeGroups(groups = "TEST SMOKE")
	public void beforegroup() {

		Reporter.log("beforegroup", true);
	}

	@AfterGroups(groups = "TEST SMOKE")
	public void aftergroup() {

		Reporter.log("aftergroup", true);
	}

	@BeforeSuite()
	public void beforeSuite() {

		Reporter.log("beforeSuite", true);
	}

	@AfterSuite()
	public void afterSuite() {

		Reporter.log("afterSuite", true);
	}

	@BeforeTest()
	public void beforeTest() {

		Reporter.log("beforeTest", true);
	}

	@AfterTest()
	public void afterTest() {

		Reporter.log("afterTest", true);
	}

}
