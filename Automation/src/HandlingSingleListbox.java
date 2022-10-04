package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleListbox  {     //to check month of dob & input month name
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args)  {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//syntax
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create New Account")).click();
	WebElement monthBox = driver.findElement(By.id("month"));
	Select s=new Select(monthBox);
	s.selectByIndex(1);
	s.selectByValue("4");
	s.selectByVisibleText("Oct");
	
	
}
}

 

