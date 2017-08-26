package selenium3;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.awt.event.KeyEvent;

public class RobotDemo {



@Test
public void Fileupload() throws AWTException, InterruptedException{

// Start browser
WebDriver driver = new FirefoxDriver();

// maximize browser
driver.manage().window().maximize();

// Specify the file location with extension
StringSelection sel = new StringSelection("C:\\Users\\abhi\\Desktop\\1.docx");

// Copy to clipboard
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
System.out.println("selection" +sel);

// Open Monster.com
driver.get("http://my.monsterindia.com/create_account.html");
Thread.sleep(2000);

// This will scroll down the page 
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("scroll(0,350)");

// Wait for 5 seconds
Thread.sleep(5000);

// This will click on Browse button
driver.findElement(By.id("wordresume")).click();



System.out.println("Browse button clicked");

// Create object of Robot class
Robot robot = new Robot();
Thread.sleep(1000);
// Press Enter
robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);

// Release Enter
robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);

// Press CTRL+V
robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
robot.keyPress(java.awt.event.KeyEvent.VK_V);

// Release CTRL+V
robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
robot.keyRelease(java.awt.event.KeyEvent.VK_V);
Thread.sleep(1000);

//Press Enter 
robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);

}

}