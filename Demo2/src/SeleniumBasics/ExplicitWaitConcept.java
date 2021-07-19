package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	static WebDriverWait wait;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\podhuri\\OneDrive - Capgemini\\Desktop\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		wait = new WebDriverWait(driver, 30);
		clickOn(driver.findElement(By.xpath("//*[contains(text(),\"Gmail\")]")));
		
	}
	
	public static void clickOn( WebElement locator) {
		System.out.println("1");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(text(),\"Gmail\")]")));
		System.out.println("2");
		locator.click();
		
	}
}
