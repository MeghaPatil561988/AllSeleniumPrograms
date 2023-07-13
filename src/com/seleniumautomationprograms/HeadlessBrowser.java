package com.seleniumautomationprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessBrowser 
{
@Test
      public void Test()
      {
	       WebDriverManager.chromedriver().setup();
	       ChromeOptions chromeoptions = new ChromeOptions();
	       chromeoptions.addArguments("---Headless");
		   WebDriver driver=new ChromeDriver(chromeoptions);
		   
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.google.com");
		   driver.findElement(By.xpath(".//*[@title='Search']")).sendKeys("selenium by bakkappa n");
		   
		   System.out.println("execition completed");
		   driver.quit();
      }
}
