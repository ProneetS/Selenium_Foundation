package scrollWebPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollWebPage {

	public static void main(String[] args) {
		
		//invoking Browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//window level scrolling
		js.executeScript("window.scrollBy(0,500)");
		
		//Table level scrolling present inside window.
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=5000");
		
		//store the WebElements inside a list of this Table, (identifying the required table as parent child relationship) 
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		
		//Traverse through all WebElements and get their values
		int sum = 0;
		for(int i = 0; i < values.size(); i++) {
			//convert string to integer
			sum = sum + Integer.parseInt(values.get(i).getText());
		}
		
		System.out.println(sum);
		
		//comparing sum with the value displayed in the webpage
		//driver.findElement(By.cssSelector(".totalAmount")).getText();
		int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, total);

	}

}
