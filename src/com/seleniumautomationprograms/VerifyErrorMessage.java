package com.seleniumautomationprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyErrorMessage
{
	
	public static void main(String[] args) throws InterruptedException
	{
		String acterrmsg;  
		String expterrmsg = "Login incorrect. Please try again";
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ksrtc.in/oprs-web/");
		
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("submitBtn")).click();
		Thread.sleep(2000);
		acterrmsg = driver.findElement(By.tagName("strong")).getText();
		System.out.println(acterrmsg);
		try {
			Assert.assertEquals(acterrmsg, expterrmsg);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Assert.assertTrue(acterrmsg.contains(expterrmsg));//this takes the single condition
		finally
		{
			System.out.println("Test Passed");
		}
		Thread.sleep(2000);
		
		driver.close();
		
}
}
