package qsp;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildBrowserTitleNaukri
 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args)  {
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.naukri.com/");
	 Set<String> allwh = driver.getWindowHandles();
	System.out.println(allwh);
	for(String wh:allwh) {
		driver.switchTo().window(wh);
		String title=driver.getTitle();
		System.out.println(title);
	}
	driver.quit();
	
}
}
