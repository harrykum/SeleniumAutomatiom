package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameTextBox   
{

static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException  {
WebDriver driver=new ChromeDriver();
driver.get("file:///G:/jspider/selenium%20sandeep%20sir/30,%205%20jan%202022/page1.html");
driver.switchTo().frame(0);
Thread.sleep(1000);
driver.findElement(By.id("t2")).sendKeys("jsp");
driver.switchTo().parentFrame();
Thread.sleep(1000);
driver.findElement(By.id("t1")).sendKeys("qsp");

}
}

