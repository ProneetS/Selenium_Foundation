package e2ePractice_Code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentScope {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//select option 2 from check-box example
		driver.findElement(By.id("checkBoxOption2")).click();
		String option = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		System.out.println(option); //output is option2
		
		//as drop-down is having select tag, handling with select class
		//store the dropdown in a web element object
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select opt = new Select(dropdown);
		//select the drop down, where the text is match with option value(i.e. here its option2).
		opt.selectByVisibleText(option);
		
		//enter the same text that you got in option variable
		driver.findElement(By.id("name")).sendKeys(option);
		//click on alert button
		driver.findElement(By.id("alertbtn")).click();
		
		//switch to alert pop up and get the text
		System.out.println(driver.switchTo().alert().getText());
		
		String text = driver.switchTo().alert().getText();
		
		if(text.contains(option)) {
			System.out.println("Text havin matching word");
		}else {
			System.out.println("Text doesn't have matching word");
		}
	}

}
