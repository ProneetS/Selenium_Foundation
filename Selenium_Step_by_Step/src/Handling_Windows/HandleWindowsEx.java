package Handling_Windows;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowsEx {

	public static void main(String[] args) {
		
		//invoking browser
		WebDriver driver = new ChromeDriver();
		
		//visit the url (Parent window)
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		//click on the blinking link
		driver.findElement(By.cssSelector(".blinkingText")).click();
		
		//getting the information about how many windows are opened
		Set<String> wind = driver.getWindowHandles(); //[parentWindow-ID, childWindow-ID]
		
		//iterating through the returned value of set
		Iterator<String> it = wind.iterator();
		
		//moving the iterator to parent window id
		String parentID = it.next();
		
		//moving the iterator to child window
		String childID = it.next();
		
		//switching to child window
		driver.switchTo().window(childID);
		
		//grabbing the entire line of text where the mail id is present
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		//extracting the text
		String emailid = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		
		//switch back to parent window
		driver.switchTo().window(parentID);
		
		//identifying the user id field and entering the mail-id.
		driver.findElement(By.id("username")).sendKeys(emailid);
		
	}

}
