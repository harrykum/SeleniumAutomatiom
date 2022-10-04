package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandlingIfMultiListbox1 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/jspider/selenium%20sandeep%20sir/22p,%2024%20dec%202021/food.html");
		WebElement slvListBox=driver.findElement(By.id("slv"));
		Select s=new Select(slvListBox);
		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("poori");
		Thread.sleep(1000);
		if (s.isMultiple()==true) {
			s.deselectAll();
		}
		driver.close();
	}

}
