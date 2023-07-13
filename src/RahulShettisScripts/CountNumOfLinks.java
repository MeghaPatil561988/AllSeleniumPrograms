package RahulShettisScripts;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.util.Strings;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountNumOfLinks {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

        //count number of links in webpage
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//count fo footer section
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
		System.out.println( footerdriver.findElements(By.tagName("a")).size());
		
		//count of footer section in column1
		WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		 
 
		//click on each link and check pages are opening or not
		
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
        {
			String clickonlinktab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
			Thread.sleep(2000L);
        }//open all the tabs
			
			Set<String> switchtoeachtab = driver.getWindowHandles();
			Iterator<String> it = switchtoeachtab.iterator();
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		
		
		driver.quit();
		

	}

}
