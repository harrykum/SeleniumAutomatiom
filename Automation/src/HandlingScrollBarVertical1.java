package qsp;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HandlingScrollBarVertical1
 {

static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args)  {
WebDriver driver=new ChromeDriver();
driver.get("https://www.bbc.com/");
RemoteWebDriver j=(RemoteWebDriver) driver;
j.executeScript("window.scrollBy(0,3000)");


}
}
