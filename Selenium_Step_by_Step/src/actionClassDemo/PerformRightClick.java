package actionClassDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformRightClick {

	public static void main(String[] args) {

		// invoking browser
		WebDriver driver = new ChromeDriver();

		// visit the amazon.com
		driver.get("https://www.amazon.in/");
		
		//maximize the window
		driver.manage().window().maximize();

		// create Action class object.
		Actions a = new Actions(driver);
		
		//perform mouse hover action
		WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));

		//  right click on the element and use build() and perform() method to execute it
		a.moveToElement(move).contextClick().build().perform();

	}

}
