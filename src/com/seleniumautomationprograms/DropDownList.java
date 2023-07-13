package com.seleniumautomationprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;
public class DropDownList 
{
@Test
public void Test() throws InterruptedException
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.linkText("Create New Account")).click();;
	Thread.sleep(3000);
	WebElement  birthdaymonth = driver.findElement(By.id("month")); 
	Select month_dropdown = new Select(birthdaymonth);
	
	/*month_dropdown.selectByIndex(12);
    Thread.sleep(3000);
    
	month_dropdown.selectByValue("2");
	Thread.sleep(3000);
	
	month_dropdown.selectByVisibleText("Mar");
	Thread.sleep(3000);*/
	
	WebElement result = month_dropdown.getFirstSelectedOption();
	System.out.println(result.getText());
	Thread.sleep(3000);
	
	List<WebElement> months = month_dropdown.getOptions();
	System.out.println(months.size());
	
	for(WebElement ele : months) 
	{
		String name_months = ele.getText();
		System.out.println("months are listed "  +name_months);
	}
	driver.close();
}
}
