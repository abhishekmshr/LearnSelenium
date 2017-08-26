package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDropDemo {
	@Test
	public void testdrag() throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		WebElement src=driver.findElement(By.xpath(".//*[@id='draggable']"));
		WebElement dest=driver.findElement(By.xpath(".//*[@id='droppable']"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.dragAndDrop(src, dest).build().perform();
		
		
	}

}
