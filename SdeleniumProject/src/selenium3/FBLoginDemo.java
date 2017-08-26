package selenium3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FBLoginDemo {


@Test
public void login() throws AWTException
{
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhishek@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abhishek@gmail.com");
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
}
}
