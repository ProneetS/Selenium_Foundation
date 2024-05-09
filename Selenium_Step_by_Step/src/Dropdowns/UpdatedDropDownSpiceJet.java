package Dropdowns;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDownSpiceJet {

	public static void main(String[] args) throws InterruptedException {
		
		//Invoking Chrome Browser
		WebDriver driver = new ChromeDriver();
				
		//visit url
		driver.get("https://www.spicejet.com/");
		
		driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers\"]")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers\"]")).getText());
		
		Thread.sleep(1000);
		
		for(int i = 1; i < 5; i++){
		driver.findElement(By.xpath("//div[@data-testid=\"Adult-testID-plus-one-cta\"]")).click();
		}
		
		driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers-done-cta\"]")).click();
		
		System.out.println(driver.findElement(By.xpath("//div[@data-testid=\"home-page-travellers\"]")).getText());
	}

}
