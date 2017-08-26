package selenium3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class HandleAlert {
	
	@Test
	public void closeAlert()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ksrtc.in/site/");
		
	}

}
