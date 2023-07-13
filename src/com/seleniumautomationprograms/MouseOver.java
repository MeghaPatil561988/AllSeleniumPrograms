package com.seleniumautomationprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {
	@Test
	public void Test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		/*
		driver.get("https://www.glowtouch.com/");
		
		WebElement dropdownlink = driver.findElement(By.xpath(" //span[contains(text(),'Our Story')]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(dropdownlink).build().perform();
		
		driver.findElement(By.xpath("//span[contains(text(),'News')]")).click();
		
		Thread.sleep(15000);
		driver.quit();
		
		*/
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		WebElement move = driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
		//After mouse over how to right click on that element
		a.moveToElement(move).contextClick().build().perform();
		
		//how to enter capital letters in search text box
		//how to select that entire text from textbox use doubleClick()
				
		a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		
		
		
	}
}
