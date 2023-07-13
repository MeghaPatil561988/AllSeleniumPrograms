package com.seleniumautomationprograms;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Resources.base;
import pageObjects.Groups;

public class CleanupGroupTC extends base {
public WebDriver driver;
	
	private static Logger log = LogManager.getLogger(DashBoardPage.class.getName());
	@BeforeTest
	public void initialize() throws IOException 
	{

		 driver=initializedriver();
		 log.info("driver is initialized");
		 driver.get(prop.getProperty("url"));
		 //log.info("navigated to Dashboard Page");
	}
	@Test
	public void navigatetogroups() throws Exception 
	{
		
		 Groups g = new Groups(driver);
		
		 String status ="My New Test Group1";
		 
		 g.getLoginLink("testuser3377@io.co.za","Password!@!@3377");
		 log.info("successfully navigated to landing page");
		 
		
		 
		 WebElement groupselement = driver.findElement(By.xpath("//a[@href='/customer/groups']"));
		 Actions action = new Actions(driver);
		 Thread.sleep(3000);
		 action.moveToElement(groupselement);
		 driver.findElement(By.xpath("//a[@href='/customer/groups']")).click();
		 
		 System.out.println("groups clicked");
		 
		 
		//CLEAN UP PROPERTIES
	/*	List<String> grouprowelementsdelete = getRowElements(status);
		 
		 Assert.assertTrue(grouprowelementsdelete .get(2).equals("ACTIVE"));
		 System.out.println("verifying status" +grouprowelementsdelete.get(2).equals("ACTIVE"));
		 
		 Assert.assertTrue(grouprowelementsdelete.get(3).equals("Manage"));
		 System.out.println("verifying status is active" +grouprowelementsdelete.get(2).equals("Manage"));*/
		 
		 
		
		/*WebElement mytable = driver.findElement(By.xpath("//table[@class='q-table']/tbody"));
			List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
			 int rows_count = rows_table.size();
			    System.out.println(rows_count);

			 for (int i=0; i<rows_count; i++)
			    {
			    
			    List<WebElement> Columns_row = rows_table.get(i).findElements(By.tagName("td"));
			    System.out.println("loacte to that specific row "+i+" are "+Columns_row );
			    } */
			 
			 WebElement table=driver.findElement(By.xpath("//table[@class='q-table']/tbody"));
			 
			 List<WebElement> rows_table = table.findElements(By.tagName("tr")); 
			 int rows_count = rows_table.size();
			    System.out.println(rows_count);
			 //content=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
			 for(int i=0;i<rows_count;i++) 
			 {
				 List<WebElement> Columns_row = rows_table.get(i).findElements(By.tagName("td"));
				 System.out.println("loacte to that specific row "+i+" are "+Columns_row );
				 Columns_row.get(i).click();
			     System.out.println(Columns_row.get(i).getText());
			 }
		
		 
		 
	/*	 WebElement manage = driver.findElement(By.xpath("//table[@class='q-table']/tbody[1]/tr[28]/td[4]/a[1]/span[2]/span[1]/span[1]"));
		 Thread.sleep(3000);
		 action.moveToElement(manage).perform();;
		 driver.findElement(By.xpath("div#__layout>div>div>div>main>div:nth-of-type(3)>div:nth-of-type(2)>div>div>div>table>tbody>tr:nth-of-type(28)>td:nth-of-type(4)>a>span:nth-of-type(2)>span>span")).click();
		 System.out.println("clicked on manage button");
		*/
		 
		 //delete property
		/*  WebElement deletegroupelement = driver.findElement(By.xpath("//span[contains(text(),'Delete property')]"));
		 Thread.sleep(3000);
		 action.moveToElement(deletegroupelement).perform();
		 driver.findElement(By.xpath("//span[contains(text(),'Delete property')]")).click();
		 
		
		 System.out.println("clicked on delete button");*/
		  
		 
	}
	
	 private List<String> getRowElements(String group) 
	 {
		 WebElement row = driver.findElement(By.xpath("//tr[contains(normalize-space(),'My New Test Group1')][1]"));
		 List<WebElement> col =  row.findElements(By.tagName("td"));
		 List<String> colvalues = col.stream().map(element->element.getText()).collect(Collectors.toList());
		 System.out.println("printcolvalues"+colvalues);
		 return colvalues;
	 }
	 
	  
	 


@AfterTest
public void teardown() 
{
	driver.quit();
}
	
}
