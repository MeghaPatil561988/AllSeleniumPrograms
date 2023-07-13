package com.seleniumautomationprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	
	@Test
	public void Test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		/*
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(frame);
		
		//1st way
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		
		
		Actions action = new Actions(driver);
		action.dragAndDrop(src,dest).build().perform();  
		
		
		//perform any other actions on webpage outside of this frame 
		//webdriver will not switch it automatically
		driver.switchTo().defaultContent();
		
		Thread.sleep(10000);*/
		
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		//driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		//Actions class method to drag and drop 
		Actions builder = new Actions(driver);
		WebElement from = driver.findElement(By.id("draggable"));
		WebElement to = driver.findElement(By.id("droppable")); 
		//Perform drag and drop
		builder.dragAndDrop(from, to).perform();
		//verify text changed in to 'Drop here' box 
		String textTo = to.getText();
		System.out.println(textTo);
		if(textTo.equals("Dropped!"))
		{
		System.out.println("PASS: File is dropped to target as expected");
		}
		else
		{
		System.out.println("FAIL: File couldn't be dropped to target as expected");
		}
		
		driver.switchTo().defaultContent();
		
		driver.quit();
		

}
}
