package seleniumcommon;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilities {

	public void screenShot(WebDriver driver, String filename) {
		
		File outFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
        File simpleFile=new File("/Users/harikrishnareddy/eclipse-workspace/onlineclasses//"+filename+"Screen_1.PNG");
		
		try {
			FileUtils.copyFile(outFile,simpleFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
