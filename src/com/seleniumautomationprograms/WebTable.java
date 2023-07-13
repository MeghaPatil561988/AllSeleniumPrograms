package com.seleniumautomationprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable 
{
	@Test
	public void Test1() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://webdatacommons.org/webtables/");
		WebElement rowelement = driver.findElement(By.xpath("//div[@id='toccontent']/table[1]/tbody[1]/tr[3]/td[2]"));
		System.out.println("row value is"+ rowelement.getText());
		
		List<WebElement>rowelements = driver.findElements(By.xpath("//div[@id='toccontent']/table[1]/tbody/tr"));
		System.out.println("number of rows is"+rowelements.size());
		
		List<WebElement>colelements = driver.findElements(By.xpath("//div[@id='toccontent']/table[1]/tbody/tr[1]/th"));
		System.out.println("number of columns is"+colelements.size());
		
		
		driver.quit();
		
	}
}
