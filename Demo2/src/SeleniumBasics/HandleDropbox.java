package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropbox {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\podhuri\\OneDrive - Capgemini\\Desktop\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru="); // enter url
		
		
		Select select = new Select(driver.findElement(By.id("state")));
		select.selectByVisibleText("California");
	}

}
