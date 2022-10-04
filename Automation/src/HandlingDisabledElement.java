package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingDisabledElement 
 {

static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args)  {
WebDriver driver=new ChromeDriver();
driver.get("file:///G:/jspider/selenium%20sandeep%20sir/29p%204%20jan%202022/disabled.html");
driver.findElement(By.id("d1")).sendKeys("admin");
RemoteWebDriver r=(RemoteWebDriver) driver;
r.executeScript("document.getElementById('d2').value='manager'");
}
}
