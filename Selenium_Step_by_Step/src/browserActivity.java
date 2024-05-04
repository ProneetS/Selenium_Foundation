import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserActivity {

	public static void main(String[] args) {
		
		
		//Invoking Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		//maximize the window
		driver.manage().window().maximize();
		
		
		//moving from chrome to amazon.com
		driver.navigate().to("https://www.amazon.in");
		
		//coming back to google search page
		driver.navigate().back();
		
		//moving forward again
		driver.navigate().forward();

	}

}
