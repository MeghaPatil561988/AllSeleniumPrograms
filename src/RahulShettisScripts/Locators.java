package RahulShettisScripts;




	/*
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/");
		
	       
		//driver.findElement(By.xpath("(//div[@class='login-btn']//a)[2]")).click();
		driver.findElement(By.className("register-btn")).click();
		
		driver.findElement(By.id("email")).sendKeys("patilmegha.m5@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1234");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Your email or password is incorrect.')]")).getText());
		
		//driver.findElement(By.xpath("//a[contains(text(),'Forgot Password')]")).click();
		driver.findElement(By.linkText("Forgot Password")).click();
		System.out.println("clicked");
		
		//label[contains(@class,'form-label bodyMain')]/following-sibling::input[1]
		//driver.findElement(By.cssSelector("input[autocomplete='email']")).sendKeys("patilmegha.m5@gmail.com");
		//driver.findElement(By.xpath("//input[@value='Next']")).click();
	
		//driver.close();
		 
		 */
	
	
	
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators 
{
public static void main(String[] args) throws InterruptedException 
{
	//implicit wait - 2 seconds time out

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

	driver.get("https://rahulshettyacademy.com/locatorspractice/");

	driver.findElement(By.id("inputUsername")).sendKeys("rahul");

	driver.findElement(By.name("inputPassword")).sendKeys("hello123");

	driver.findElement(By.className("signInBtn")).click();

	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

	driver.findElement(By.linkText("Forgot your password?")).click();

	Thread.sleep(1000);//

	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");

	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");

	driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

	driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");

	driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");

	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

	System.out.println(driver.findElement(By.cssSelector("form p")).getText());

	driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();

	Thread.sleep(1000);

	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");

	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");

	driver.findElement(By.id("chkboxOne")).click();

	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

	}
}


	
	


