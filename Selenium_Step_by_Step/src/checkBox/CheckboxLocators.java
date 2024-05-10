package checkBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxLocators {

	public static void main(String[] args) {
		
		//invoking chrome browser
		WebDriver driver = new ChromeDriver();
		
		//visit url
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Check box is not clicked yet and it supposed to give output as false
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//clicking on senior citizen check box
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		
		//verifying whether the check box is clicked or not
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//count the number of check box present in the current window
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

	}

}
