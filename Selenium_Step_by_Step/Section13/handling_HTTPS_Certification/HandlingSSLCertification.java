package handling_HTTPS_Certification;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandlingSSLCertification {

	public static void main(String[] args) {
		
		//setting up the behavior
		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		
		//invoke browser
		WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		

	}

}
