package qsp;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar_ToBottomOfTheWebPage 
 {

static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException  {
WebDriver driver=new ChromeDriver();
driver.get("https://www.bbc.com/");
JavascriptExecutor j=(JavascriptExecutor) driver;
Thread.sleep(5000);
j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
}
}

