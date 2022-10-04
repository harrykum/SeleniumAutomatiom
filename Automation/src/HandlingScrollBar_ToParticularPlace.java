package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar_ToParticularPlace
 {

static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args)  {
WebDriver driver=new ChromeDriver();
driver.get("https://www.bbc.com/");
 Point y = driver.findElement(By.xpath("//span[text()='Future Planet']")).getLocation();
JavascriptExecutor j=(JavascriptExecutor) driver;
j.executeScript("window.scrollTo(0,"+y+")");


}

}
