package HandlingFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentIFrames {

	public static void main(String[] args) {
		
		//invoke browser
		WebDriver driver = new ChromeDriver();
		
		//visit url
		driver.get("https://the-internet.herokuapp.com/");
		
		//click on nested frames
		driver.findElement(By.linkText("Nested Frames")).click();
		
		//switching by frame name
		driver.switchTo().frame("frame-top");

		driver.switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.id("content")).getText());
		

	}

}
