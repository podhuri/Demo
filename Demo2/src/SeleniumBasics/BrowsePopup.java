package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowsePopup {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\podhuri\\OneDrive - Capgemini\\Desktop\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		//when type=file then only it will work
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\podhuri\\OneDrive - Capgemini\\Desktop\\p.html");
		
		
		
	}

}
