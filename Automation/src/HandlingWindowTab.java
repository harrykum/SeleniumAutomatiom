package qsp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowTab {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args)  {
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.linkText("actiTIME Inc.")).click();
	 Set<String> allTab = driver.getWindowHandles();
	int count=allTab.size();
	System.out.println(count);
	for(String tab:allTab) {
		driver.switchTo().window(tab);
		driver.close();
	}
	
	
}
}
