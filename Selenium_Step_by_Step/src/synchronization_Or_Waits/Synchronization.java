package synchronization_Or_Waits;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	
	public static void main(String[] args) throws InterruptedException {

		// invoking the chrome browser
		WebDriver driver = new ChromeDriver();
		
		//applying implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

		// declaring vegetables array that we need
		String[] veggies = { "Cucumber", "Brocolli", "Beetroot" };
	

		// visit the url
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		addItems(driver, veggies);
		
		//click on cart icon
		driver.findElement(By.cssSelector("img[alt=\"Cart\"]")).click();
		
		//click on proceed to checkout button (As it is a static text we can directly use text)
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		//applying explicit wait on page change from "proceed to check out" to "apply promo code" page
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promoCode")));
		
		//enter promo code rahulshettyacademy
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		
		//click on apply button
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//applying Explicit wait
		
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("span.promoInfo"))); //wait until this specific element visible in your html DOM
		
		//get the text 
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
		

	}

	public static void addItems(WebDriver driver, String[] veggies) {
		
		int count = 0;
		
		// storing all the items to a list
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		
		// iterating through all the product to find the location/index of cucumber
		for (int i = 0; i < products.size(); i++) {

			// Format the vegetable name from “Brocolli – 1 Kg” to “Brocolli” using split()
			// method
			String[] name = products.get(i).getText().split("-");

			// removing extra space after the actual veggie name.
			String formattedName = name[0].trim();

			// converting array to array-list in run time
			List itemsNeededList = Arrays.asList(veggies);

			// if the name that we are getting is present in the list, then go inside
			if (itemsNeededList.contains(formattedName)) {

				count++;

				// click on add to cart whose i value is cucumber
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

				// adding break after found 3 veggies mentioned in array
				if (count == veggies.length) {
					break;
				}

			}
		}
	}

}
