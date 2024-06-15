package scrollWebPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Of_Tables {

	public static void main(String[] args) {
		
		//invoking Browser
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
				
		JavascriptExecutor js = (JavascriptExecutor)driver;
				
		//window level scrolling
		js.executeScript("window.scrollBy(0,500)");
		
		//store the table in a WebElement
		WebElement table = driver.findElement(By.id("product")); //the scope is only in web tables (not in entire WebPage)
		
		System.out.println("Rows present in the table = " + table.findElements(By.tagName("tr")).size()); 
		//it will inspect all the WebElement with TagName "tr" in that webTable only, if driver.findElements, the it will search in complete page
		//so here I have limited the WebDriver to only Table by grabbing the id="product"
		
		System.out.println("Columns of the table = "+ table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		//out of all the rows i need the 1st <tr> i.e. get(0)
		//here i am doing .findEelements again for <th> tag
		//get the count of <th> tag inside <tr> tag
		
		List<WebElement> secondRow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		//The content that i need is inside <td> tag of <tr>
		//so, inside the list all the 3 values will be stored.
		
		//printing all the 3 data
		System.out.println();
		System.out.println("The data of 2nd row are: ");
		System.out.println(secondRow.get(0).getText());
		System.out.println(secondRow.get(1).getText());
		System.out.println(secondRow.get(2).getText());
		
		
		

	}

}


/* Assignment
1.	Print the number of rows and columns present in this table.
Expected output will be: No of rows = 11
No. of column = 3
2.	Print the 2nd row of data.
*/