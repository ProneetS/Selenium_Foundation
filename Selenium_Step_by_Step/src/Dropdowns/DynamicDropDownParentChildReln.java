package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownParentChildReln {

	public static void main(String[] args) throws InterruptedException {
		
		//invoking Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//visit url
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//click on the "From" drop down 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//finding "From" drop down city in parent child relationship XPath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='JRG']")).click();
		
		Thread.sleep(2000);
		
		//finding "To" drop down city in parent child relationship XPath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		

	}

}

//Note : This is an alternate to indexing concept in dynamic drop down 
