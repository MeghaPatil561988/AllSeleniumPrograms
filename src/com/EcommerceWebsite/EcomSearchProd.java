package com.EcommerceWebsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EcomSearchProd 
{
	/*
	 Test Case 1- Automate 'Search Product' Functionality of an e-commerce website
Steps to Automate:
1. Open link http://automationpractice.com/index.php
2. Move your cursor over Women's link.
3. Click on sub menu 'T-shirts'
4. Get Name/Text of the first product displayed on the page.
5. Now enter the same product name in the search bar present on top of page and click search button.
6. Validate that same product is displayed on searched page with same details which were displayed on T-Shirt's page.
 
	*/
	
	 public static void main(String[] args) throws InterruptedException{

		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  String URL="http://automationpractice.com/index.php";

		  driver.get(URL);
		  driver.manage().window().maximize();
		  
		  // Initialise Actions class object
		  Actions actions=new Actions(driver);
		  driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		  WebElement womenTab=driver.findElement(By.linkText("WOMEN"));
		  WebElement TshirtTab=driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul//a[@title='T-shirts']"));
		  actions.moveToElement(womenTab).moveToElement(TshirtTab).click().perform();
		  Thread.sleep(2000);
		  
		  // Get Product Name
		  String ProductName=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")).getText();
		  System.out.println(ProductName);
		  Thread.sleep(2000);
		  driver.findElement(By.id("search_query_top")).sendKeys(ProductName);
		  Thread.sleep(2000);
		  driver.findElement(By.name("submit_search")).click();
		  Thread.sleep(2000);
		  
		  // Get Name of Searched Product
		  String SearchResultProductname=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]")).getText();
		  Thread.sleep(2000);

		  // Verify that correct Product is displaying after search
		  if(ProductName.equalsIgnoreCase(SearchResultProductname)) 
		  {
		   System.out.println("Results Matched;Test Case Passed");
		  }
		  else
		  {
		   System.out.println("Results NotMatched;Test Case Failed");
		  }
		  Thread.sleep(2000);
		  
		  // Close the browser
		  driver.close();
		 }
}
