package SeleniumBasics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\podhuri\\OneDrive - Capgemini\\Desktop\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		
		//get the total count of links on the page
		//get the text of each link on the page
		
		List <WebElement> linklist = driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());//size of link list
		for (int i =0 ; i<linklist.size();i++) {
			String s = linklist.get(i).getText();
			System.out.println(s);
		}
	}

}
