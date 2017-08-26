package selenium3;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class launchChromeTestng {
	WebDriver driver;
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchChromeTestng cls=new launchChromeTestng();
		cls.init();
		cls.launchFB();
		cls.createAccount("abhishek", "mishra", "abhishek_mshr@yahoo.co.in", "Password1","14","Feb","1982","male");
		
		
		//cls.driver.quit();
		
	}*/
	@Test
	public void init()
	{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		this.driver=new ChromeDriver();
		Assert.assertNotNull(driver);
	}
	@Test
	public void launchFB()
	{this.driver.manage().window().maximize();
	this.driver.get("https://www.facebook.com");
String title=driver.getTitle();
System.out.println("Titls is "+title);
	Assert.assertEquals(title, "Facebook – log in or sign up");	
	}
	
	@Test
	public void valMonthDropDown()
	{
		WebElement ele=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select mon=new Select(ele);
		int size=mon.getOptions().size();
		Assert.assertEquals(size, 13);
		List<WebElement> monthlist=mon.getOptions();
		ArrayList<String> monthdef=new ArrayList<String>();
		monthdef.add("Month");
		monthdef.add("Jan");monthdef.add("Feb");monthdef.add("Mar");monthdef.add("Apr");
		monthdef.add("May");monthdef.add("Jun");monthdef.add("Jul");monthdef.add("Aug");
		monthdef.add("Sept");monthdef.add("Oct");monthdef.add("Nov");monthdef.add("Dec");
		int i=0;
		for(WebElement ele1:monthlist)
		{
			Assert.assertEquals(ele1.getText(), monthdef.get(i));
			i++;
		}
		
	}
	
	/*public void createAccount(String first,String last,String ema,String Pass,String birthday,String month,String year,String sex)
	{ 
		String firstnameStr="//input[@name='firstname']";
	
	String lastnameStr="//input[@name='lastname']";
	String emailStr="//input[@name='reg_email__']";
	String passStr="//input[@name='reg_passwd__']";
	String day="//select[@name='birthday_day']";
	String mon="//select[@name='birthday_month']";
	String yea="//select[@name='birthday_year']";
	String se="//input[@id='u_0_i']";
	

		WebElement firstname=getElementbyXpath(firstnameStr);
		WebElement lastname=getElementbyXpath(lastnameStr);
		WebElement email=getElementbyXpath(emailStr);
		WebElement pass=getElementbyXpath(passStr);
		WebElement dayofmonth=getElementbyXpath(day);
		Select d=new Select(dayofmonth);
		WebElement monthofyear=getElementbyXpath(mon);
		Select m=new Select(monthofyear);

		WebElement yearofbirth=getElementbyXpath(yea);
		Select y=new Select(yearofbirth);

		WebElement sex1=getElementbyXpath(se);
		firstname.sendKeys(first);
		lastname.sendKeys(last);
		email.sendKeys(ema);
		pass.sendKeys(Pass);
		sex1.click();
		
		d.selectByVisibleText(birthday);
		m.selectByVisibleText(month);
		y.selectByVisibleText(year);
		
	}*/
public WebElement getElementbyXpath(String xPath)
{
	return this.driver.findElement(By.xpath(xPath));
}
}
