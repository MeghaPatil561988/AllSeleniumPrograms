package RahulShettisScripts;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		String downloadpath = System.getProperty("user.dir");
		WebDriverManager.chromedriver().setup();
		
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory",downloadpath);
   
		ChromeOptions options=new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver=new ChromeDriver(options);
	    driver.manage().window().maximize();
		
	    //this belove 4 line code for file upload remaining code for filedownload
		driver.get("https://altoconvertpdftojpg.com/");
		driver.findElement(By.cssSelector("[class*='btn--choose']")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Megha\\Documents\\check\\fileupload1.exe");
		
		
		
		
		WebDriverWait wait =new WebDriverWait(driver,5);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class*='medium']")));
		driver.findElement(By.cssSelector("button[class*='medium']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("g-btn-auto-width")));
		driver.findElement(By.linkText("g-btn-auto-width")).click();
		
		Thread.sleep(3000);
		
		File f = new File( downloadpath+"/Result.zip");
		if(f.exists()) 
		{
			Assert.assertTrue(f.exists());

			if(f.delete())

			System.out.println("file deleted");
		}

	}

}
/*
 Reference Material for AutoIT
Automating window Controls with Selenium:



· Handling Window Authentication Pop Up
http://Username:Password@SiteURL

· Driver.get();

· Handling File Upload from Windows using AutoIT


What is AutoIT
Install AutoIT
AutoIT Scripting
Integrating AutoIT with Selenium



//Shift focus to the file upload windows

//set text/path into file name edit box

//click open to upload file



Au3info- record window component objects

Build Script -scite.exe

Save it- .au3 extenstion

Convert file into .exe by compiling .au3 file

Call .exe file with Runtime class in java into your selenium tests





ControlFocus("Open","","Edit1")

ControlSetText("Open","","Edit1","C:\Users\rahul\Documents\check\visit.pdf")

ControlClick("Open","","Button1")






 */
