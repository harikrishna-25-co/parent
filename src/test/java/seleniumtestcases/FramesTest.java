package seleniumtestcases;

import org.testng.annotations.Test;

import seleniumframework.Base;
import seleniumpages.FramesPage;

public class FramesTest extends Base{

	@Test
	public  void frames() {
		
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");

		
		FramesPage framepage=new FramesPage(driver);
		
		framepage.countsFrames();
		
		framepage.switchingToFrame1();
		
		framepage.takeScreenShot(driver,"Screen1" );
		
		framepage.frameLinks();
		
		framepage.switchingDefault();
		
		framepage.switchingToFrame2();
		
		framepage.anotherLinks();
		
		
		
		
		
}
	
}
