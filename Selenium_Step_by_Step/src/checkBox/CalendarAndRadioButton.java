package checkBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarAndRadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		//invoking the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//visit the url
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		/*----select "From" and "To", then only calendar will get activated automatically.----*/
		
		//click on the "From" drop down 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//finding "From" drop down city in parent child relationship XPath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='JRG']")).click();
		
		Thread.sleep(2000);
		
		//finding "To" drop down city in parent child relationship XPath
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
		
		/*------------------------------------------------------------------------------------*/
		
		//select the current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover")).click();
		

	}

}
