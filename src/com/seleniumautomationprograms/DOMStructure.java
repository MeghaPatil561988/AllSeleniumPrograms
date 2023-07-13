package com.seleniumautomationprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DOMStructure 
{
	@Test
	public void Test1() throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("selenium");
		System.out.println("passed");
		//driver.findElement(By.xpath("//div[@class='gb_9d gb_i gb_og gb_fg']/div[2]/a")).click();
		//System.out.println("clicked");
		  */
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();

		driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();

		System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
		driver.close();
    }
}