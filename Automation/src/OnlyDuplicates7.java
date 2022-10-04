package qsp;


import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class OnlyDuplicates7 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args)  {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/jspider/selenium%20sandeep%20sir/21p,%2023%20dec%202021/food1.html");
		WebElement slvListBox=driver.findElement(By.id("slv"));
		Select s=new Select(slvListBox);
		int counter=0;
		TreeSet<String> t1=new TreeSet<String>();
		List<WebElement> alloption = s.getOptions();
		int count = alloption.size();
		for(int i=0;i<count;i++) {
	    String text = alloption.get(i).getText();
	     t1.add(text);
		}
		for(String a:t1) {
		System.out.println(a);
		}
		driver.close();
	
		
}
}