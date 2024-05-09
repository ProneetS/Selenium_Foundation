package dropDowns_Class_02;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		//invoke chrome browser
		WebDriver driver = new ChromeDriver();
		
		//visit the url
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//provide the input
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		
		Thread.sleep(2000);
		
		//Extract all the items
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		//iterate over the list
		for(WebElement option:options) {
			
			//Use getText() to see if it matches with your requirement/ real value
			if(option.getText().equalsIgnoreCase("India")) {
				
				//Click on that value
				option.click();
				
				//break the loop
				break;
			}
		}
		

	}

}
