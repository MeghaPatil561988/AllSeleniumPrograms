package RahulShettisScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableExcersise 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");

		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));//complete table css
		int rowcount= table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size(); //all row common css
		
	    int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr'] div:nth-child(3)")).size();//3rd column all values
	
	    System.out.println(count);//13

		for(int i=0;i<count-2;i++)//13-2=11
		{
		String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int valueinteger=  Integer.parseInt(value);
		sum=sum+valueinteger;//120
		}
		System.out.println(sum);
		
		String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue=Integer.parseInt(Extras);
		int TotalSumValue=sum+extrasValue;
		System.out.println(TotalSumValue);//124
		

		String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalVAlue=Integer.parseInt(ActualTotal);
		if(ActualTotalVAlue==TotalSumValue)//124==124
		{
		System.out.println("Count Matches");
		}
		else
		{
		System.out.println("count fails");
		}
		
		driver.quit();
		}
	
}
