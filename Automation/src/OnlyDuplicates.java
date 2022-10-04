package qsp;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlyDuplicates {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/jspider/selenium%20sandeep%20sir/21p,%2023%20dec%202021/food1.html");
		WebElement slvListBox=driver.findElement(By.id("slv"));
		Select s=new Select(slvListBox);
		HashSet<String> hs=new HashSet<>();
		List<WebElement> alloption = s.getOptions();
		int count = alloption.size();
		for(int i=0;i<count;i++) {
	    String text = alloption.get(i).getText();
		if (hs.add(text)==false) 
		{
		System.out.println(text);
		}
		}
		driver.close();
	
		
}
}