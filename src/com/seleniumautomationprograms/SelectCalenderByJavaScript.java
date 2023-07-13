package com.seleniumautomationprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


//import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCalenderByJavaScript
{
	@Test
	   public void Test1()
	   {

			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			driver.get("https://www.spicejet.com/");
			
			WebElement date = driver.findElement(By.xpath(""));
			
			SelectDateByJS(driver,element,dateval);
			
       }
	
	   public static void SelectDateByJS(WebDriver driver,WebElement element, String dateval)
	   {
		   JavascriptExecutor js = ((JavascriptExecutor)driver); 
		   js.executeScript("arguments(0).setAttribute[0]('value','"+dateval+"');",element);
	   }
}