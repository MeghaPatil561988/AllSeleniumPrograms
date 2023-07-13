package RahulShettisScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TableAsgnmrowcolumn {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	/*	
		WebElement mytable = driver.findElement(By.xpath("//table[@id='product']/tbody"));
		List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
	    //To calculate no of rows In table.
	    int rows_count = rows_table.size();
	    System.out.println(rows_count);

	    //Loop will execute till the last row of table.
	    for (int i=0; i<rows_count; i++)
	    {
	    //To locate columns(cells) of that specific row.
	    List<WebElement> Columns_row = rows_table.get(i).findElements(By.tagName("td"));
	    
	    //To calculate no of columns(cells) In that specific row.
	    int columns_count = Columns_row.size();
	    System.out.println("Number of cells In Row "+i+" are "+columns_count);
	   
	
	    
	  //Loop will execute till the last cell of that specific row.
	    for (int column=0; column<columns_count; column++)
	    {
	    //To retrieve text from that specific cell.
	        String celtext = Columns_row.get(column).getText();
	        System.out.println("Cell Value Of row number "+i+" and column number "+column+" Is "+celtext);
	    }
		
	    System.out.println("--------------------------------------------------");
	    }
	    
	 */
		
	/*different type of solution
	   System.out.println(driver.findElements(By.cssSelector(".left-align tr")).size());
        System.out.println(driver.findElements(By.cssSelector(".left-align th")).size());
        System.out.println(driver.findElement(By.cssSelector(".left-align tr:nth-child(3)")).getText());
	  */
		
	/*
	 JavascriptExecutor js = (JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,600)");

//Count total no.of rows
WebElement table=driver.findElement(By.id("product"));
System.out.println("Total no. of columns are ---> " +table.findElements(By.tagName("tr")).size());

//Count total no. of column
int column = driver.findElements(By.cssSelector("table[class='table-display'] th")).size();
System.out.println("Total no. of columns are ----> " +column);

//2nd row content
List<WebElement> content=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
for(int i=0;i<content.size();i++) 
{
System.out.println(content.get(i).getText());
}

 */
	
		WebElement table=driver.findElement(By.id("product"));

        System.out.println(table.findElements(By.tagName("tr")).size());
        System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
        List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
        System.out.println(secondrow.get(0).getText());
        System.out.println(secondrow.get(1).getText());
        System.out.println(secondrow.get(2).getText());
	    driver.quit();
}
}
