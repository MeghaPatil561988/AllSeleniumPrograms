package com.EcommerceWebsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EcomSignUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
/*
Test Case 1 - Automate User Registration Process

Steps to Automate:
1. Open this url  http://automationpractice.com/index.php
2. Click on sign in link.
3. Enter your email address in 'Create and account' section.
4. Click on Create an Account button.
5. Enter your Personal Information, Address and Contact info.
6. Click on Register button.
7. Validate that user is created.
*/
		
		
		 
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  String URL="http://automationpractice.com/index.php";

		  driver.get(URL);
		  driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		  driver.manage().window().maximize();
		  
		//Click on Sign in
		  driver.findElement(By.linkText("Sign in")).click();
		  Thread.sleep(2000);
		  
		//Enter email address
		  driver.findElement(By.id("email_create")).sendKeys("mpatil.m50@gmail.com");
		  Thread.sleep(3000);
		  
		//Click on "Create an account"
		  driver.findElement(By.xpath("//span[text()[normalize-space()='Create an account']]")).click();
		  Thread.sleep(3000);
		 

		  //Select Title
		  driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
		  driver.findElement(By.name("customer_firstname")).sendKeys("Test User");
		  driver.findElement(By.name("customer_lastname")).sendKeys("Vsoft");
		  driver.findElement(By.id("passwd")).sendKeys("PKR@PKR");
		  
		// Enter your address
		  driver.findElement(By.id("firstname")).sendKeys("Test User");
		  driver.findElement(By.id("lastname")).sendKeys("Vsoft");
		  driver.findElement(By.id("company")).sendKeys("Vsoft");
		  driver.findElement(By.id("address1")).sendKeys("Test 81/1,2nd cross");
		  driver.findElement(By.id("city")).sendKeys("XYZ");
		  
		  
		// Select State
		  WebElement statedropdown=driver.findElement(By.name("id_state"));
		  Select oSelect=new Select(statedropdown);
		  oSelect.selectByValue("4");

		  driver.findElement(By.name("postcode")).sendKeys("51838");
		  
		  // Select Country
		  WebElement countrydropDown=driver.findElement(By.name("id_country"));
		  Select oSelectC=new Select(countrydropDown);
		  oSelectC.selectByVisibleText("United States");
		  
		  //Enter Mobile Number
		  driver.findElement(By.id("phone_mobile")).sendKeys("234567890");
		  driver.findElement(By.xpath("//input[@name=\"alias\"]")).clear();
		  driver.findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys("Office");
		  driver.findElement(By.name("submitAccount")).click();
		  Thread.sleep(3000);
		 
		  String testUserVsoft = driver.findElement(By.xpath("//span[text()='Test User Vsoft']")).getText();
		  
		  Thread.sleep(3000);
		  
		// Validate that user has created
		  if(testUserVsoft.contains("Vsoft")) 
		  {
		   System.out.println("User Verified,Test case Passed");
		  }
		  else 
		  {
		   System.out.println("User Verification Failed,Test case Failed");
		  }
		  
		  
		  
		// Expected Title
		  String expectedTitle = "Techlistic"; 
		  
		// Get Title of current Page
		  String actualTitle = driver.getTitle();
		  System.out.println("Title fetched: "+ actualTitle);
		  
		  // Validate/Compare Page Title
		  if(expectedTitle.equals(actualTitle)) {
		   System.out.println("Test Case Passed.");
		  }
		  else {
		   System.out.println("Test Case Failed.");
		  }
		  
		
          driver.quit();

    }
}
