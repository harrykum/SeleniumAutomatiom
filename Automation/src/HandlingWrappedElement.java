package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWrappedElement  {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/jspider/selenium%20sandeep%20sir/22p,%2024%20dec%202021/food.html");
		WebElement SlvListBox=driver.findElement(By.id("slv"));
		Select s=new Select(SlvListBox);
		Thread.sleep(5000);
			String text = s.getWrappedElement().getText();
			System.out.println(text);
		driver.close();
		}
}	