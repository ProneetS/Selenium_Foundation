package actionClassDemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAction {

	public static void main(String[] args) {
		
		//invoking browser
		WebDriver driver = new ChromeDriver();
		
		//visit amazon.com
		driver.get("https://www.amazon.in/");
		
		//Create action class object and pass "driver" as an argument.
		Actions a = new Actions(driver);
		
		//perform mouse hover action and use build() and perform() method to execute it
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform();
		
	}

}

//Initially it will ask for a captcha, just enter it and then re run the code. It will work.
//Captcha is not handled yet.
