package handlingCalendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendar {

	public static void main(String[] args) {
		
		String monthNumber = "9";
		String date = "25";
		String year = "2028";
		
		//invoking browser
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on the calendar icon
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		
		//click two times to get years
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
	
		//select the given years
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		
		//here month number is given but in calendar month is re[resented as text like for 6 its June
		//1st get the list of all 12 months details and then in List the indexing starts from 0 and not from 1, so inside get() monthNumber - 1.
		//so change the string to integer for monthNumber.
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(monthNumber)-1).click();
		
		//select the date
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();

	}

}
