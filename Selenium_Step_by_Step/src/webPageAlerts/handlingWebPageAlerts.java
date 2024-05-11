package webPageAlerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingWebPageAlerts {

	public static void main(String[] args) {
		
		//declaring name 
		String name = "Prabhash";
		
		//invoking Chrome Diver
		WebDriver driver = new ChromeDriver();
		
		//visit url
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//handling 1st type of alert where only "OK" is present
		
		//entering name and click on "alert" button
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("alertbtn")).click();
		
		//switching to alert pop-up and grabbing the text and accept it i.e. click on "Ok"
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//handling 2nd type of alert where "OK" and "Cancel" both are present.
		
		//entering name and click on "confirm" button
		driver.findElement(By.id("name")).sendKeys(name);
		driver.findElement(By.id("confirmbtn")).click();
		
		//switching to alert pop-up and grabbing the text and accept it i.e. click on "Cancel"
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
	}

}
