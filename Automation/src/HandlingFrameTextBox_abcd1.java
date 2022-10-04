package qsp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameTextBox_abcd1
{

static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException  {
WebDriver driver=new ChromeDriver();
driver.get("file:///G:/jspider/selenium%20sandeep%20sir/30,%205%20jan%202022/page1.html");
driver.findElement(By.id("t1")).sendKeys("a");
driver.switchTo().frame("f1");
Thread.sleep(2000);
driver.findElement(By.id("t2")).sendKeys("b");
driver.switchTo().parentFrame();//like this also can be done
Thread.sleep(2000);
driver.findElement(By.id("t1")).sendKeys("c");
 driver.switchTo().frame("f1");
 Thread.sleep(2000);
 driver.findElement(By.id("t2")).sendKeys("d");
}
}
