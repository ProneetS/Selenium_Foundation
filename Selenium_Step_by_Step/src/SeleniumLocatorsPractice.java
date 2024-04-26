import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocatorsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//hit url
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//finding web element and sending value 
		driver.findElement(By.id("inputUsername")).sendKeys("proneet"); //user name
		driver.findElement(By.name("inputPassword")).sendKeys("kumar123"); //password
		driver.findElement(By.className("signInBtn")).click(); //click on sign-in button
		
		//if you don't wait then it will fail again as it's taking some time to give that error.
		//adding implicit wait
		
		
		//here I am using CSS Selectors to get the error message
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		//Forgot password (Linked Text)
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//Name, email, phone number (Using X-path)
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Pete");
		driver.findElement(By.xpath("input[placeholder='Email']")).sendKeys("Pete@yahoomail.com"); //used CSS Selector
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("991200120"); //used indexing 
		
		//after giving details 
		
		
		

	}

}


//from line 10 - 18, it explains login to the web-site is failed successfully. (1st part is successful)
