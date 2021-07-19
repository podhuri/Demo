package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\podhuri\\OneDrive - Capgemini\\Desktop\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://classic.freecrm.com/index.html");
		
		//driver.findElement(By.linkText("LOG IN")).click();
		driver.findElement(By.name("username")).sendKeys("batchautomation ");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//Thread.sleep(3000);
		
		//driver.switchTo().frame("mainpanel");
		
		
		//driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		System.out.println("before frame");
		driver.switchTo().frame("mainpanel");
		System.out.println("after frame");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@title='Pipeline']")).click();
		driver.findElement(By.partialLinkText("Pipeline")).click();
		
		
				
		
	}

}
