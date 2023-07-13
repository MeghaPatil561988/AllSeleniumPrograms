package com.seleniumautomationprograms;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotsSelenium4 
{
	   @Test
       public void Test() throws InterruptedException 
       {
    	   WebDriverManager.chromedriver().setup();
   		   WebDriver driver=new ChromeDriver();
   		   driver.manage().window().maximize();
   		
   		   driver.get("https://www.youtube.com/channel/UCutQjK5N6zIT-vXqXa4WI0A");
   		   
   		  // WebElement channelheader = driver.findElement(By.xpath("//div[@id='channel-header-container']"));
   		   WebElement channelheader = driver.findElement(By.xpath(".//*[@id='content']"));
   		File file = channelheader.getScreenshotAs(OutputType.FILE);
   		
   		try 
   		{
			FileUtils.copyFile(file, new File("./screenshots/channelHeader.png"));/*source and destination*/
			Thread.sleep(3000);
		} 
   		catch (IOException e) 
   		{
			
			e.printStackTrace();
		}
   		driver.quit();
       }
}
