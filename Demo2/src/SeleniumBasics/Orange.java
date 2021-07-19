package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\podhuri\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewPersonalDetails/empNumber/7#");
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.linkText("Admin")).click();
		String user = driver.findElement(By.xpath("//div[@class='head']//h1")).getText();
		//String u1 = user.getText();
		System.out.println(user);
		/*if(u1.equals("System Users"))
			System.out.println("True");
		else
			System.out.println("False");
			
		driver.quit();
		
*/
	}

}
