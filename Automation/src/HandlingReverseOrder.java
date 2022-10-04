package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingReverseOrder  {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/jspider/selenium%20sandeep%20sir/22p,%2024%20dec%202021/food.html");
		WebElement SlvListBox=driver.findElement(By.id("slv"));
		Select s=new Select(SlvListBox);
		List<WebElement> allOptions=s.getOptions();
		int count = allOptions.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			Thread.sleep(500);
			s.selectByIndex(i);
		}
		for(int i=count-1;i>=0;i--) {
			Thread.sleep(500);
			s.deselectByIndex(i);
		}	
		driver.close();
		
	}
}

