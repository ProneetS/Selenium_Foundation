package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingIFrames {

	public static void main(String[] args) {
		
		//invoking browser
		WebDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
		
		//visit the URL
		driver.get("https://jqueryui.com/droppable/");
		
		//to know the size of frame (how many frames are present)
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		//switch to I-frame
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		//locate the element to be drag and dropped 
		Actions a = new Actions(driver);
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		//Performing drag and drop operations
		a.dragAndDrop(source, destination).build().perform();
		
		//coming out of frame to perform on other web element which are not inside of frame
		driver.switchTo().defaultContent();
		
	}

}


//if you want to do any action on frame inner element without moving inside of frame, then "No such element found" error will occur.

