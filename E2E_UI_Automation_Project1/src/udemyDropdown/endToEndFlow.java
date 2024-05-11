package udemyDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class endToEndFlow {

	public static void main(String[] args) throws InterruptedException {
		
		//invoking chrom browser
		WebDriver driver = new ChromeDriver();
		
		//visit the url
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//click on "From"
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		//select "Jarsuguda" city
		driver.findElement(By.xpath("//a[@value='JRG']")).click();
		
		Thread.sleep(2000);
		
		//click on "To" and select "Delhi" city
		driver .findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='DEL']")).click();
		
		Thread.sleep(2000);
		
		//select the current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		//validation for "return date is disabled"
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			
			System.out.println("Its disabled.");
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		//click on passenger tab
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(1000);
		
		//selecting 4 adults and 3 child
		for(int i = 1; i < 4; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		for(int i = 1; i < 4; i++) {
			driver.findElement(By.id("hrefIncChd")).click();
		}
		
		//validate how many adults and children are got selected
		System.out.println("Adults " + driver.findElement(By.id("spanAudlt")).getText());
		System.out.println("Child " + driver.findElement(By.id("spanChild")).getText());
		
		
		//click on "family and friend" check box
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		//click on search button
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

	}

}
