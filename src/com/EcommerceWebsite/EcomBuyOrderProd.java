package com.EcommerceWebsite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
/*
 Test Case 1 - Automate End to End Buy Order functionality.

Steps to Automate:
1. Open link http://automationpractice.com/index.php
2. Login to the website.
3. Move your cursor over Women's link.
4. Click on sub menu 'T-shirts'.
5. Mouse hover on the second product displayed.
6. 'More' button will be displayed, click on 'More' button.
7. Increase quantity to 2.
8. Select size 'L'
9. Select color.
10. Click 'Add to Cart' button.
11. Click 'Proceed to checkout' button.
12. Complete the buy order process till payment.
13. Make sure that Product is ordered.

 */
public class EcomBuyOrderProd 
{
	 public static void main(String[] args) throws InterruptedException{

		  WebDriverManager.chromedriver().setup();
		  WebDriver driver=new ChromeDriver();
		  String URL="http://automationpractice.com/index.php";
		  
		  // Open URL and Maximize browser window
		  driver.get(URL);
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

		  //Click on Sign in
		  driver.findElement(By.linkText("Sign in")).click();
		  Thread.sleep(2000);
		  
		  //Login
		  driver.findElement(By.id("email")).sendKeys("test1249@test.com");
		  driver.findElement(By.id("passwd")).sendKeys("PKR@PKR");
		  driver.findElement(By.id("SubmitLogin")).click();
		  Thread.sleep(2000);
		  
		  //Click on Women
		  driver.findElement(By.linkText("WOMEN")).click();
		  Thread.sleep(2000);

		  WebElement SecondImg=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div[2]/ul/li[2]/div/div[1]/div/a[1]/img"));
		  WebElement MoreBtn=driver.findElement(By.xpath("/html/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul/li[2]/div[1]/div[2]/div[2]/a[2]"));
		  Actions actions=new Actions(driver);
		  actions.moveToElement(SecondImg).build().perform();
		  actions.moveToElement(MoreBtn).click().perform();
		  Thread.sleep(2000);

		  //Change quantity by 2
		  driver.findElement(By.id("quantity_wanted")).clear();
		  driver.findElement(By.id("quantity_wanted")).sendKeys("2");
		  Thread.sleep(2000);

		  //Select size as L
		  WebElement Sizedrpdwn=driver.findElement(By.xpath("//*[@id='group_1']"));
		  Select oSelect=new Select(Sizedrpdwn);
		  oSelect.selectByVisibleText("M");
		  Thread.sleep(2000);

		  //Select Color
		  driver.findElement(By.id("color_11")).click();
		  Thread.sleep(2000);

		  //Click on add to cart
		  driver.findElement(By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']")).click();
		  Thread.sleep(2000);

		  //Click on proceed
		  driver.findElement(By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")).click();
		  Thread.sleep(2000);
		  
		  //Checkout page Proceed
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();
		  Thread.sleep(2000);
		  
		  //Agree terms&Conditions
		  driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span")).click();
		  Thread.sleep(2000);

		  //Click on Payby Check
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")).click();
		  Thread.sleep(2000);
		  
		  //Confirm the order
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();
		  Thread.sleep(2000);

		  //Get Text
		  String ConfirmationText=driver.findElement(By.xpath("//div[@id='center_column']/p[@class='alert alert-success']")).getText();
		  Thread.sleep(2000);
		  
		  // Verify that Product is ordered
		  if(ConfirmationText.contains("complete"))
		  {
		   System.out.println("Order Completed: Test Case Passed");
		  }
		  else
		  {
		   System.out.println("Order Not Successfull: Test Case Failed");
		  }
		  Thread.sleep(2000);
		  driver.quit();
		 }
	
}
