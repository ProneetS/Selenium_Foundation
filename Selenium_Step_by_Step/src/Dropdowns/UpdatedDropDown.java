package Dropdowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		//Invoking Chrome Browser
		WebDriver driver = new ChromeDriver();
		
		//visit url
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//find out Passengers tab to select 5 adults
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(1000);
		
		//getting the text to verify before selecting the passenger
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//looping to select 5 adults
		for(int i = 1; i < 5; i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		//clicking on done button
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		//getting the text to verify after selecting the passenger
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
