package e2ePractice_Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope_Of_Web_Driver {

	public static void main(String[] args) {
		
		//invoking the browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//Q1> Find the count of all links present in the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2> find the count of all links present in footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG")); //limiting WebDriver scope to footer section only
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		//3> find the count of all links present in 1st column of footer section
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); //limiting WebDriver scope to footer section 1st column only
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		//click on each link in the column and check if pages are opening
		for(int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
			columnDriver.findElements(By.tagName("a")).get(i).click();
		}
	}

}

//note: for loop start with i=1 and not i=0, due to 1st link of the column is not working