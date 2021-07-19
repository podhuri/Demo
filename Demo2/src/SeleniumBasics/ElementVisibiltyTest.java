package SeleniumBasics;

import org.openqa.selenium.By;

public class ElementVisibiltyTest extends Base{

	public ElementVisibiltyTest(String AppUrl) {
		super(AppUrl);
	}

	public static void main(String[] args) {
			
		ElementVisibiltyTest evt = new ElementVisibiltyTest("https://register.freecrm.com/register/");
		
		//isDisplayed() : is applicable for all the elements . return true if present and false if not visible
		
		Boolean login = driver.findElement(By.xpath("//div[@class=\"field\"]//child::button[@name=\"action\"]")).isDisplayed();
		System.out.println(login);
		
		//isEnabled() : button or element present on page is disabled with disabled property it will return true else false
		Boolean signup = driver.findElement(By.xpath("//div[@class=\"field\"]//child::button[@name=\"action\"]")).isDisplayed();
		System.out.println(signup);
		
		
		//isSelected() : only applicable for checkbox, dropdown, radiobutton, return true if any of them is ticked or selected else false
		
		Boolean untick = driver.findElement(By.xpath("//div[@class=\"ui checkbox\"]//child::input[@name=\"terms\"]")).isSelected();
		System.out.println(untick);
	
		driver.findElement(By.xpath("//div[@class=\"ui checkbox\"]//child::input[@name=\"terms\"]")).click();;
		Boolean tick= driver.findElement(By.xpath("//div[@class=\"ui checkbox\"]//child::input[@name=\"terms\"]")).isSelected();
		System.out.println(tick);
		
		driver.quit();
	}

}
