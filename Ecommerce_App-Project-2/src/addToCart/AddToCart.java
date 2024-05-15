package addToCart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) {
		
		//invoking the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//visit the url
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		//storing all the items to a list
		List<WebElement> products = driver.findElements(By.className("h4.product-name"));
		
		//iterating through all the product to find the location/index of cucumber
		for(int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			
			if(name.contains("Cucumber")) {
				//click on add to cart
				driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
			}
		}

	}

}
