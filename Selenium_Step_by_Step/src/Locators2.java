import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		//open URL in browser
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		String name = "Proneet";
		//Signing with User ID and Password
		driver.findElement(By.id("inputUsername")).sendKeys(name); 
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy"); 
		driver.findElement(By.className("signInBtn")).click(); 
		
		Thread.sleep(2000);
		
		//Validating successful message
		String actualText = driver.findElement(By.tagName("p")).getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText, "You are successfully logged in.");
		
		//validating name in login page "Hello *name* " by passing name variable to string
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class=\"login-container\"] h2")).getText(), "Hello "+name+",");
		
		
		

	}

}
