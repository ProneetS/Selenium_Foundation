import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocatorsPractice {

	public static void main(String[] args) throws InterruptedException {
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
		
		//putting waiting time to complete the rendering of the page after slide.
		Thread.sleep(2000);
		
		//Name, email, phone number (Using X-path)
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Pete");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Pete@yahoomail.com"); //used CSS Selector
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("991200120"); //used indexing 
		
		//after giving details clicking on RESET Login button
		driver.findElement(By.className("reset-pwd-btn")).click();
		//it will give below error on this step
		/*Exception in thread "main" org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element <button class="reset-pwd-btn">...</button> is not clickable at point (583, 433). Other element would receive the click: <button class="go-to-login-btn">...</button>
		  (Session info: chrome=124.0.6367.61)*/
		
		//grabbing the highlighted text
		System.out.println(driver.findElement(By.cssSelector("form p")).getText()); //used CSS selector
		
		//from parent to child traverse for 'go to login page' button
		driver.findElement(By.xpath("//div[@class=\"forgot-pwd-btn-conainer\"]/button[1]")).click();
		
		//signing in with correct user name and password
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Dummy101");
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy"); //used regular expression of CSS Selector
		
		//selecting the check box
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		
		//clicking on submit button
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); //regular expression of XPath where 'contains' keyword is used.
		
		
		
		
		
		
		

	}

}


//from line 10 - 18, it explains login to the web-site is failed successfully. (1st part is successful)
