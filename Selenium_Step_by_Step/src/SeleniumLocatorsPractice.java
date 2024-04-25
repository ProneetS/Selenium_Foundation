import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocatorsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//hit url
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//finding web element and sending value 
		driver.findElement(By.id("inputUsername")).sendKeys("proneet"); //user name
		driver.findElement(By.name("inputPassword")).sendKeys("kumar123"); //password
		driver.findElement(By.className("signInBtn")).click(); //click on sign-in button
		
		

	}

}
