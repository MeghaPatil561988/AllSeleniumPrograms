package RahulShettisScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1Megha {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

       
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
	
	 driver.findElement(By.id("checkBoxOption2")).click();
	
	 Thread.sleep(2000L);
	
	String checkboxopt2=driver.findElement(By.id("checkBoxOption2")).getAttribute("value");
	System.out.println(checkboxopt2);
	
	WebElement saticdropdown= driver.findElement(By.id("dropdown-class-example")); 
	Select dropdown = new Select(saticdropdown);
	
	dropdown.selectByIndex(2);
	Thread.sleep(3000);
	System.out.println(dropdown.getFirstSelectedOption().getText());
	
	String var = dropdown.getFirstSelectedOption().getText();
	
	driver.findElement(By.id("name")).sendKeys(var);
	driver.findElement(By.id("alertbtn")).click();
	Thread.sleep(3000L);
	System.out.println(driver.switchTo().alert().getText());

	
	String Actualtxt=driver.switchTo().alert().getText();
	String Expttxt = "Hello Option2, share this practice page and share your knowledge";
	Assert.assertEquals(Actualtxt, Expttxt);
	
	Thread.sleep(3000L);
	
	System.out.println(driver.switchTo().alert().getText());
	//System.out.println(driver.switchTo().alert().getText().split(",")[0].split(" ")[1].trim());
	driver.switchTo().alert().accept();
	Thread.sleep(3000L);

	
	driver.quit();
	

	}

}
