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
		
		//calling the method
		String password = getPassword(driver);
		
		//from parent to child traverse for 'go to login page' button 
		driver.findElement(By.xpath("//div[@class=\"forgot-pwd-btn-conainer\"]/button[1]")).click();
		
		Thread.sleep(1000);
		
		String name = "Proneet";
		//Signing with User ID and Password
		driver.findElement(By.id("inputUsername")).sendKeys(name); 
		driver.findElement(By.name("inputPassword")).sendKeys(password); 
		driver.findElement(By.className("signInBtn")).click(); 
		
		Thread.sleep(2000);
		
		//Validating successful message
		String actualText = driver.findElement(By.tagName("p")).getText();
		System.out.println(actualText);
		Assert.assertEquals(actualText, "You are successfully logged in.");
		
		//validating name in login page "Hello *name* " by passing name variable to string
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class=\"login-container\"] h2")).getText(), "Hello "+name+",");
		//Concatenation happen with a variable and string.
		
		//working on Logout button 
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		System.out.println("Successfully Logged Out");
		
		//close the browser
		driver.close();

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException //passing WebDriver driver as an argument for diver to be used
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Forgot password (Linked Text)
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//putting waiting time to complete the rendering of the page after slide.
		Thread.sleep(2000);
		
		//directly clicking on RESET Login button
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		//grabbing the highlighted text
		String PasswordText = driver.findElement(By.cssSelector("form p")).getText();
		
		//text we got " Please use temporary password 'rahulshettyacademy' to Login. "
		//Splitting the text based on ' (single quote)
		String[] PasswordArray = PasswordText.split("'");
		// PasswordArray[0] = Please use temporary password 
		// PasswordArray[1] = rahulshettyacademy' to Login.
		
		//split again to get the password text
		String[] PasswordArray2 = PasswordArray[1].split("'");
		// PasswordArray2[0] = rahulshettyacademy
		// PasswordArray2[1] = to Login.
		//you can extract 0th index in another way also. PasswordArray[1].split("'")[0]
		
		//storing the password in a variable
		String Password = PasswordArray2[0];
		return Password;
		
		
	}

}
