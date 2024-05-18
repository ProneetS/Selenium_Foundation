package synchronization_Or_Waits;

import java.time.Duration;
import java.util.function.*;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.WebElement;

public class FluentWaitImplementation {

	public static void main(String[] args) {
		
		
		//invoking browser
				WebDriver driver = new ChromeDriver();
				
				//visit url
				driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
				
				//click on start button using cssSelectors
				driver.findElement(By.cssSelector("div[id='start'] button")).click();
				
				//As FluentWait is implementing Wait Interface
				//explicitly telling that driver argument is a WebDriver and giving timeout capability
				//Telling Fluent wait that, in what regular time interval it need to check and monitor for that object.
				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
						.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
				
				
				//information about on what object we need to put timeout/polling
				//Wait till the Hello World is displayed.
				WebElement txt = wait.until(new Function<WebDriver, WebElement>() {
				     public WebElement apply(WebDriver driver) {
				    	 if(driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed()) {
				    		 return driver.findElement(By.cssSelector("div[id='finish'] h4"));
				    	 }
				    	 else
				          return null;
				     }
				    });
				
				System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed());
				System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).getText());
	}
}

//in console it return false

