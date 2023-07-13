package RahulShettisScripts;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Schroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//put it in chrome chropath console and check
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(3000L);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		Thread.sleep(3000L);
		
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		for(int i=0;i<values.size();i++) 
		{
			sum=sum + Integer.parseInt(values.get(i).getText());
			//System.out.println(sum);
		}
		System.out.println(sum);
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		Assert.assertEquals(sum, total);
		
		
		
		List<WebElement> values1 = driver.findElements(By.cssSelector("#product td:nth-child(3)"));
		
		int sum1=0;
		for(int i =0;i<values1.size();i++) 
		{
			sum1 = sum1 + Integer.parseInt(values1.get(i).getText());
		}
		
		System.out.println(sum1);
		
		driver.quit();
		
		
	}

}
