package scrollWebPages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
		
		

	}

}
