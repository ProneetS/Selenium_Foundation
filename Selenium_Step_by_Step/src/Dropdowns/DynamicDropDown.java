package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		//invoking chrome browser
		WebDriver driver = new ChromeDriver();
		
		//open the url
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//click on the "From" drop down 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//selecting the city from "From" drop down
		driver.findElement(By.xpath("//a[@value='JRG']")).click();
		
		Thread.sleep(2000);
		
		//selecting the city from "To" drop down which will enable after selecting city from "From"
		driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		
		
	}

}
// Note: this is the indexing concept of dynamic drop down when you have multiple instances in a web page