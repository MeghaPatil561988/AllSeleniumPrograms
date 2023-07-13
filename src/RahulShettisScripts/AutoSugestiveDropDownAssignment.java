package RahulShettisScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSugestiveDropDownAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//Actions act = new Actions(driver);
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("autocomplete")).sendKeys("united");
		Thread.sleep(2000L);
		
		/*List<WebElement> list = driver.findElements(By.cssSelector("li[class='ui-menu-item'] "));
		Thread.sleep(2000L);
		act.moveToElement((WebElement) list).perform();
		
		Thread.sleep(2000L);
		for(WebElement option : list) 
		{
			if(option.getText().equalsIgnoreCase("United Kingdom (UK)"))
			{
				option.click();
				break;
			}
		}
	*/
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
		
		driver.quit();

		
	}
	
}
