package qsp;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildBrowserCloseWithoutUsingQuitNaukri
 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException  {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.naukri.com/");
	 Set<String> allwh = driver.getWindowHandles();
	System.out.println(allwh.size());
	for(String wh:allwh) {
		driver.switchTo().window(wh);
		Thread.sleep(5000);
	}
		driver.close();
	
	
	
}
}

