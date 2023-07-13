package com.seleniumautomationprograms;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicXpath {
	@Test
	public void Test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");

		driver.findElement(By.linkText("Create New Account")).click();;
		Thread.sleep(3000);
		
		/*
		 * .//tagname[@Attibute_Name = 'value']
		 * */
		//driver.findElement(By.xpath(".//input[@type='text']")).sendKeys("Megha");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath(".//input[@type='text'][@id='u_1_d']")).sendKeys("patil");
		Thread.sleep(3000);
		//driver.findElement(By.xpath(".//input[@type='text' or @id='u_1_d]")).sendKeys("megha");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath(".//input[@type='text' and @id='u_1_d']")).sendKeys("patil");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath(".//input[contains(@class,'5dba')]")).sendKeys("abcd");
		//Thread.sleep(3000);
		driver.findElement(By.xpath(".//input[starts-with(@class,'inputtext ')]")).sendKeys("1234");
		Thread.sleep(3000);
		driver.quit();
	}
}