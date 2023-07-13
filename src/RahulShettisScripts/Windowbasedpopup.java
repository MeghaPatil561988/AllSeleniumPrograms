package RahulShettisScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowbasedpopup {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			//https://the-internet.herokuapp.com
			//driver.get("https://the-internet.herokuapp.com");
			driver.get("http://admin:admin@the-internet.herokuapp.com");
			driver.findElement(By.linkText("Basic Auth")).click();
			driver.quit();

	}

}
