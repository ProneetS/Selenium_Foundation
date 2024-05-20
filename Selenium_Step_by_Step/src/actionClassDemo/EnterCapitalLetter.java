package actionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnterCapitalLetter {

	public static void main(String[] args) {
		
		//invoking browser
		WebDriver driver = new ChromeDriver();
		
		//visit the amazon.com
		driver.get("https://www.amazon.in/");
		
		
		//create Action class object.
		Actions a = new Actions(driver);
		
		//creating web element variable for the search bar web element
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		
		//perform click and then enter letter by holding "shift" key (Become capital latter)
		//select the text by double clicking it
		a.moveToElement(searchBar).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		

	}

}

//alternate of keyDown(Keys.SHIFT) is clickAndHold()

//captcha is not handled yet. So run the code, enter the captcha, do not close the selenium chrome browser, run the code again