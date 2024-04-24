import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumWebdrivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//importing chrome driver
		//ChromeDriver driver = new ChromeDriver();
		//WebDriver driver = new ChromeDriver();
		
		//opening with firefox driver
		WebDriver driver = new FirefoxDriver();
		
		//opening the url
		driver.get("https://rahulshettyacademy.com");
		
		//get the title of the page
		System.out.println(driver.getTitle());
		
		//get the current url
		System.out.println(driver.getCurrentUrl());
		
		//close the browser 
		//driver.close(); it will close the current window
		driver.quit(); //it will close the current window and all associated window
	}

}
