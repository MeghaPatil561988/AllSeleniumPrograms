package RahulShettisScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.id("OneWay")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("DepartDate")).click();
		
		System.out.println("selected");
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		WebElement saticdropdown =driver.findElement(By.id("Adults"));
		Select dropdown = new Select(saticdropdown);
		//dropdown.selectByValue("5");
		//System.out.println(dropdown.getFirstSelectedOption().getText());
		

		dropdown.selectByIndex(3);
		Thread.sleep(3000);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("MoreOptionsLink")).click();
		Thread.sleep(3000L);
		driver.findElement(By.id("SearchBtn")).click();
		Thread.sleep(3000L);
		
		String actual;
		String expt = "Sorry, but we can't continue until you fix everything that's marked in RED";
		actual=driver.findElement(By.id("homeErrorMessage")).getText();
		Assert.assertEquals(actual, expt);
		System.out.println("Test passed");
		
		driver.close();

	}

}
