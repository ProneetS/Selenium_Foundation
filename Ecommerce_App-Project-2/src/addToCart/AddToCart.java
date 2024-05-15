package addToCart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {

	public static void main(String[] args) throws InterruptedException {

		// invoking the chrome browser
		WebDriver driver = new ChromeDriver();

		// declaring vegetables array that we need
		String[] veggies = { "Cucumber", "Brocolli", "Beetroot" };
		int count = 0;

		// visit the url
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);

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

//code will not run, as the name is returning the extra text " - 1 Kg", so I need to trim the text. 
