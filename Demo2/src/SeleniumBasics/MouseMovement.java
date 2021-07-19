package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovement {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\podhuri\\OneDrive - Capgemini\\Desktop\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		
		Thread.sleep(3000);
		Actions addon = new Actions(driver);
		addon.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Visa Services")).click();
	}

}
