package qsp;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildBrowserCloseAllExceptParentNaukri
 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException  {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.naukri.com/");
	String Pwh= driver.getWindowHandle();
	 Set<String> allwh = driver.getWindowHandles();
	for(String wh:allwh) {
		driver.switchTo().window(wh);
		Thread.sleep(5000);
		if(wh.equals(Pwh)){
		
	}
		else {
			driver.close();
		}
	
	}
}
}


