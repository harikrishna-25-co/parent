package seleniumpages;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesPage {

	WebDriver driver;

	

		By framesNum= By.tagName("iframe");
		
		By Links= By.tagName("a");



		public FramesPage(WebDriver driver) {
			this.driver=driver;
		}

		public void takeScreenShot(WebDriver driver , String filename) {
			File elementScreenSource = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File simpleFileName = new File(
					"/Users/harikrishnareddy/eclipse-workspace/selenium-testing//"+filename+".PNG");

			try {
				FileUtils.copyFile(elementScreenSource, simpleFileName);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		public void countsFrames() {
			
			int framesList =driver.findElements(framesNum).size();
			
			System.out.println(framesList);
		}
		
		public void switchingToFrame1() {
			
			driver.switchTo().frame("packageListFrame");
		}
		
		public void frameLinks() {
			
			List<WebElement> LinksOnFrame = driver.findElements(Links);
			System.out.println("Total number of links are " + LinksOnFrame.size());
			for (WebElement links : LinksOnFrame) 
			System.out.println("links on frame is " + links.getText());
		}
		
			public void switchingDefault() {
				
				driver.switchTo().defaultContent();
			}
			
			public void anotherLinks() {
			List<WebElement> LinksOnAnotherFrame = driver.findElements(Links);
			System.out.println("Total number of links are " + LinksOnAnotherFrame.size());
			
			for (WebElement links1 : LinksOnAnotherFrame)
				System.out.println("links on frame is " + links1.getText());
			

		}
		
			public void switchingToFrame2() {
				
				driver.switchTo().frame("packageFrame");

			}

}

