package Handling_Windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWindowHandle {

	public static void main(String[] args) {
		
		//invoking browser
		WebDriver driver = new ChromeDriver();
		
		//visit url
		driver.get("https://the-internet.herokuapp.com/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//selecting "Multiple Window" from the list
		//driver.findElement(By.xpath("//*[contains(text(),'Multiple Windows')]")).click();
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		//Clicking on "Click Here"
		//driver.findElement(By.xpath("//*[contains(text(),'Click Here')]")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		//getting asll the window opened data
		Set<String> Wind = driver.getWindowHandles();
		
		//iterating through the wind value
		Iterator<String> it = Wind.iterator();
		
		//fetching parent and child window
		String parentWind = it.next();
		String childWind = it.next();
		
		//switching to child window
		driver.switchTo().window(childWind);
		
		//Grabbing the text and printing it in output
		//System.out.println(driver.findElement(By.cssSelector("div[class='example']")).getText());
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
		//return back to parent window
		driver.switchTo().window(parentWind);
		
		//grabbing the text and printing it on output
		//System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		
		//closing all windows
		driver.quit();
		
	}

}
