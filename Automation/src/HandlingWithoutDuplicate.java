package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingWithoutDuplicate  {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/jspider/selenium%20sandeep%20sir/21p,%2023%20dec%202021/food1.html");
		WebElement SlvListBox=driver.findElement(By.id("slv"));
	//	HashSet<String> hs =new HashSet<String>();
		Select s=new Select(SlvListBox);
		List<WebElement> allOptions=s.getOptions();
		for(int i=0;i<allOptions.size();i++) {
			String text = allOptions.get(i).getText();
			//hs.add(text);
			Thread.sleep(500);
			s.selectByIndex(i);
			System.out.println(text);
		}
//		for(String e:hs) {
//			System.out.println(e);
//		
//		}
		driver.close();
	}
}
