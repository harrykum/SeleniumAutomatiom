package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandlingMultiListbox  { 
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
   
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("file:///G:/jspider/selenium%20sandeep%20sir/21p,%2023%20dec%202021/food.html");
WebElement slvListBox=driver.findElement(By.id("slv"));
Select s=new Select(slvListBox);
s.selectByIndex(0);
s.selectByValue("v");
s.selectByVisibleText("poori");
Thread.sleep(5000);
s.deselectByIndex(2);
s.deselectByVisibleText("idly");
s.deselectByValue("p");
}
}
