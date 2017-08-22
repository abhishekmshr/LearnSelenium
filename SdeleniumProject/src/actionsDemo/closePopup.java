package actionsDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.Test;

public class closePopup {
	
	@Test
	public void closepoppup()
	{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://naukri.com");
	driver.manage().window().maximize();
	String parent=driver.getWindowHandle();
	Set<String>S1=driver.getWindowHandles();
	Iterator<String> ite=S1.iterator();
	while(ite.hasNext())
	{
		String child=ite.next();
		if(!parent.equals(child))
		{
			driver.switchTo().window(child);
			driver.close();
		}
	}
	driver.switchTo().window(parent);
	}
	

}
