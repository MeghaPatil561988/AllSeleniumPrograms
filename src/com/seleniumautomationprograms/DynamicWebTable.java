package com.seleniumautomationprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable 
{
	@Test
   public void Test1()
   {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		
		  //table[@id='customers']/tbody[1]/tr[2]/td[1]
          //table[@id='customers']/tbody[1]/tr[3]/td[1]
          //table[@id='customers']/tbody[1]/tr[4]/td[1]
          //table[@id='customers']/tbody[1]/tr[5]/td[1]
          //table[@id='customers']/tbody[1]/tr[6]/td[1]
          //table[@id='customers']/tbody[1]/tr[7]/td[1]
		
		List<WebElement>rows = driver.findElements(By.xpath("//table[@id='customers']/tbody[1]/tr"));
		int rowcount = rows.size();
		System.out.println("total number of rows in webtable" + rowcount);
		
		String beforeXpath = "//table[@id='customers']/tbody[1]/tr[";
		String afterXpathcompany = "]/td[1]";
		
		for(int i=2; i<=rowcount; i++)
		{
			String actualxpath = beforeXpath+i+afterXpathcompany;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
			
			if(element.getText().equals("Island Trading")) 
			{
			System.out.println("comapny name is :" +element.getText() + "is found" + "at position" +(i-1));
			break;
		    }
		
        }
		
		System.out.println("********");
		
		////table[@id='customers']/tbody[1]/tr[2]/td[2]
		String afterXpathcontact =  "]/td[2]";
		
		for(int i=2; i<=rowcount; i++)
		{
			String actualxpath = beforeXpath+i+afterXpathcontact;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
	    }
		
		
      System.out.println("********");
		
		////table[@id='customers']/tbody[1]/tr[2]/td[2]
		String afterXpathcountry =  "]/td[3]";
		
		for(int i=2; i<=rowcount; i++)
		{
			String actualxpath = beforeXpath+i+afterXpathcountry;
			WebElement element = driver.findElement(By.xpath(actualxpath));
			System.out.println(element.getText());
		}
		
		
		//Handle WebTable columns
		
		//table[@id='customers']/tbody[1]/tr[1]/th[1]
		//table[@id='customers']/tbody[1]/tr[1]/th[2]
		//table[@id='customers']/tbody[1]/tr[1]/th[3]
		
		String colbeforexpath = "//table[@id='customers']/tbody[1]/tr[1]/th[";
		String colafterxpath = "]";
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='customers']/tbody[1]/tr[1]/th"));
		int colcount = cols.size();
		System.out.println("Total number of columns are" +colcount);
		
		System.out.println("column values are");
		for(int i=1;i<=colcount;i++)
		{
		     WebElement element = driver.findElement(By.xpath(colbeforexpath+i+colafterxpath));
		     String coltext = element.getText();
		     System.out.println(coltext);
		}
		
		
		driver.quit();
}
}
