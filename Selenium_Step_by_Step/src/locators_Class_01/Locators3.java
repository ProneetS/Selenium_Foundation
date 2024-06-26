package locators_Class_01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) {
		
		//visit the url
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//click on login button (Note: XPath is written with Parent to Child and Sibling to sibling mix
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		
		//traverse from child to parent
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[3]")).getText());

	}

}
