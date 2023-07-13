package com.seleniumautomationprograms;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Slider
{
	 @Test
    public void Test() throws InterruptedException
    {
	   WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	
	   driver.get("https://jqueryui.com/slider/");
	   driver.switchTo().frame(driver.findElement(By.xpath(".//*[@class='demo-frame']")));
	   WebElement slider = driver.findElement(By.xpath(".//*[@id='slider']/span"));
	 
	   
	   Actions actions = new Actions(driver);
	   actions.clickAndHold(slider);
	   actions.moveByOffset(150, 150);
	   //System.out.println("slided");
	   actions.build().perform();
	   
	   Thread.sleep(5000);
	   driver.quit();
    }
}