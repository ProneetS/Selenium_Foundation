package Dropdowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		//invoking chrome browser
		WebDriver driver = new ChromeDriver();
		
		//open the url to test drop downs
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Thread.sleep(1000);
		
		//handling drop down with <select> tag
		
		WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticdropdown);  
		
		//select USD from drop down based upon its index value
		dropdown.selectByIndex(3);
		//need to confirm whether USD is selected or not.
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//Select the drop down based upon visible text.
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//select the drop down by value
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		

	}

}
