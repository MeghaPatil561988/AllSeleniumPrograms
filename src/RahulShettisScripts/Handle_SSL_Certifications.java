package RahulShettisScripts;


	import org.openqa.selenium.Capabilities;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.remote.CapabilityType;
	import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Handle_SSL_Certifications {

	public static void main(String[] args) 
	{
	//SSl certificates
    //Desired capabilities=
	//general chrome profile
	
	DesiredCapabilities ch=DesiredCapabilities.chrome();
  
	//ch.acceptInsecureCerts();
	ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

	//Belows to your local browser
	ChromeOptions c= new ChromeOptions();
	c.merge(ch);
	

	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Megha\\\\eclipse-workspace\\\\SeleniumPrograms\\\\lib\\\\chromedriver.exe");
    WebDriver driver = new ChromeDriver(c);
    driver.manage().window().maximize();
    




	}
}
