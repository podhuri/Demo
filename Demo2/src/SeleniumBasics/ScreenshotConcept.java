package SeleniumBasics;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotConcept extends Base{

	static String appUrl = "https://www.google.com/";
	
	public ScreenshotConcept() {
		super(appUrl);
	}
	public static void main(String[] args) throws IOException{
		
		new ScreenshotConcept();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		new File(".\\Images\\").mkdirs();
		FileHandler.copy(src, new File(".\\Images\\google1.png"));
		//FileUtils.copyFile(src, );
	}

}
