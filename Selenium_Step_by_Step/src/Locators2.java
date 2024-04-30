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
		
		//Signing with User ID and Password
		driver.findElement(By.id("inputUsername")).sendKeys("proneet"); 
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy"); 
		driver.findElement(By.className("signInBtn")).click(); 
		
		Thread.sleep(2000);
		
		//Validating successful message
		String actualText = driver.findElement(By.tagName("p")).getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText, "You are successfully logged in.");
		
		
		

	}

}
