package checkBox;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class validatingBasedOnAttributeValue {

	public static void main(String[] args) {
		
		//invoking chrome browser
		WebDriver driver = new ChromeDriver();
		
		//visit url
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//check the style attribute value Before clicking on Round Trip Radio button
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		//clicking on round trip radio button
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//check the style attribute value After clicking on "Round Trip" Radio button
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		//putting validation to check the element is enabled or disabled based on attribute value
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("Is enabled");
			Assert.assertTrue(true);
		}
		else {
			System.out.println("Is Disabled");
			Assert.assertTrue(false);
		}
	}

}
