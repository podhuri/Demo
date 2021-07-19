package SeleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcept {

	public static void main(String[] args) {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\podhuri\\OneDrive - Capgemini\\Desktop\\DRIVER\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome

		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru="); // enter url
		
		driver.manage().window().maximize();
		//1.xpath
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Poonam");
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Dhuri");
		//driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("Vishrantwadi");
		
		
		//2.id
		//driver.findElement(By.id("firstname")).sendKeys("Poonam");
		//driver.findElement(By.id("lastname")).sendKeys("Dhuri");
	
		//3.name
		//driver.findElement(By.name("firstname")).sendKeys("Naveen");
		//driver.findElement(By.name("lastname")).sendKeys("Kuntheta");
		
		
		//4.linktext
		//driver.findElement(By.linkText("Sign in")).click();
		
		//5.partiallinktext
		//driver.findElement(By.partialLinkText("Want to")).click();
		
		//6.cssselector
		driver.findElement(By.cssSelector("#address1")).sendKeys("Pune");
		
		//7.classname
		//driver.findElement(By.className("ancAsb")).click();
		
		driver.findElement(By.name("city")).sendKeys("Pune");
		

		Select state = new Select(driver.findElement(By.id("state")));
		state.selectByVisibleText("California");
		
		driver.findElement(By.id("zip")).sendKeys("411015");
		
		driver.findElement(By.name("dayphone1")).sendKeys("123");
		driver.findElement(By.name("dayphone2")).sendKeys("467");
		driver.findElement(By.name("dayphone3")).sendKeys("7869");
		
		driver.findElement(By.name("email")).sendKeys("poonamdhuri20@gmail.com");
		driver.findElement(By.name("retype_email")).sendKeys("poonamdhuri20@gmail.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("school_teacher_trains_20");
		driver.findElement(By.xpath("//*[@id=\"PASSWORD\"]")).sendKeys("Pillu1234");
		driver.findElement(By.cssSelector("#rpass")).sendKeys("Pillu1234");
		
		
		Select ques = new Select(driver.findElement(By.id("SECRET_QUESTION")));
		ques.selectByIndex(4);
		
		driver.findElement(By.name("myanswer")).sendKeys("Snow");
		
		Select month = new Select(driver.findElement(By.name("birthdate2")));
		month.selectByVisibleText("July");
		
		Select day = new Select(driver.findElement(By.name("birthdate1")));
		day.selectByVisibleText("20");
		
		Select year = new Select(driver.findElement(By.id("birthdate3")));
		year.selectByVisibleText("1998");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id=\"acceptq1\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"continue\"]/span/span")).click();
	
		driver.quit();
	
	
	
	}

}
