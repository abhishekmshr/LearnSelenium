package selenium3;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CaptureScreenshotDemo {

	@Test
	public void testScreenshot()
	{
		WebDriver driver=new FirefoxDriver();
		CaptureScreenshotDemo.captureScreenshot(driver);
		driver.manage().window().maximize();
		CaptureScreenshotDemo.captureScreenshot(driver);
		driver.get("http://www.google.com");
	/*File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try{
		FileUtils.copyFile(src, new File("C:/selenium/"+System.currentTimeMillis()+".png"));
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}*/
		CaptureScreenshotDemo.captureScreenshot(driver);
		
	}
	
	public static void captureScreenshot(WebDriver drv)
	{
		TakesScreenshot sht=(TakesScreenshot)drv;
		File src=sht.getScreenshotAs(OutputType.FILE);
		try{
			
			FileUtils.copyFile(src, new File("C:/Selenium/"+System.currentTimeMillis()+".png"));
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
