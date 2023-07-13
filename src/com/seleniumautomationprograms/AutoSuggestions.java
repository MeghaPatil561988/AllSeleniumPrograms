package com.seleniumautomationprograms;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestions {
	
	public static void main(String[] args) throws InterruptedException  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//textarea[@title='Search']")).sendKeys("selenium");
		Thread.sleep(3000);
		
       List<WebElement> listofelements= driver.findElements(By.xpath("//ul[@role='listbox']/li"));
       
       for (WebElement webElement : listofelements) 
       {
    	   if( webElement.getText().trim().equals("selenium testing"));
    	   webElement.click();
    	   break;
	   }
       Thread.sleep(10000);
       driver.quit();
}
	}
