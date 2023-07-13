package com.seleniumautomationprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTABSWINDOWS {
	@Test
	public void Test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		String SessionId=driver.getWindowHandle();
		
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.youtube.com/channel/UCutQjK5N6zIT-vXqXa4WI0A");
		
		String ChannelName=driver.findElement(By.xpath("//*[@class='style-scope ytd-channel-name']")).getText();
		System.out.println("youtube channel name is"+ChannelName);
		
		driver.switchTo().window(SessionId);
		
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(ChannelName);
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}
