package actionsDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class makeMytripSelectDate {

	@Test
	public void testmmt() throws InterruptedException{
		WebDriver drv=new FirefoxDriver();	
		drv.get("http://makemytrip.com");
		drv.manage().window().maximize();
		//String to="//div/label[text()='To']";
		/*drv.findElement(By.xpath(".//*[@id='hp-widget__sTo']")).click();
		Actions act=new Actions(drv);
		act.moveToElement(drv.findElement(By.xpath("//*[text()='New Delhi, India ']"))).click().build().perform();*/
		Thread.sleep(2000);
		/*WebDriverWait wait=new WebDriverWait(drv, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(".//div[@id='webklipper-publisher-widget-container-notification-container']"))));
		drv.findElement(By.xpath(".//div[@id='webklipper-publisher-widget-container-notification-container']/a[@class='close']")).click();
		Thread.sleep(2000);*/
		drv.findElement(By.xpath(".//*[@id='hp-widget__depart']")).click();
		//act.moveToElement(drv.findElement(By.xpath("((//div[@class='ui-datepicker-group ui-datepicker-group-first']/following::td[contains(@class,'today')])[1]/following::td)[1]"))).click().build().perform();;
		List<WebElement> dates=drv.findElements(By.xpath(".//*[@class='dateFilter hasDatepicker']/div/div[1]/table/tbody/tr/td"));
		
		int size=dates.size();
		for (int i=0;i<size;i++)
		{
			String date=dates.get(i).getText();
			if (date.equals("31"))
			{
				dates.get(i).click();
				break;
			}
		}
		
		drv.quit();
	}



}
