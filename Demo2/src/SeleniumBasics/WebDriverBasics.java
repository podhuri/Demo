package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
			
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\podhuri\\OneDrive - Capgemini\\Desktop\\DRIVER\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.get("https://www.google.com/"); // enter url
		String title = driver.getTitle(); //get title of page
		System.out.println(title);
		
		if(title.equals("Google")) { //validation: Expected vs actual 
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		
		String url = driver.getCurrentUrl(); // current url running
		
		System.out.println(url);
		
		driver.getPageSource(); // html code 
		driver.quit(); // Quits the url
		
		
	}

}
