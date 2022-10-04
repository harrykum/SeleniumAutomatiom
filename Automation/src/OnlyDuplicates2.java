package qsp;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OnlyDuplicates2 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args)  {
		System.out.println("Enter the option which you wnt to search");
		Scanner sc=new Scanner(System.in);
		String expectedOption= sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/jspider/selenium%20sandeep%20sir/21p,%2023%20dec%202021/food1.html");
		WebElement slvListBox=driver.findElement(By.id("slv"));
		Select s=new Select(slvListBox);
		int counter=0;
		List<WebElement> alloption = s.getOptions();
		int count = alloption.size();
		for(int i=0;i<count;i++) {
	    String text = alloption.get(i).getText(); 
		
		if(text.equals(expectedOption)) {
			counter++;
		 }
		}
		if(counter==0) {
	    System.out.println("option is not present");
		}
		else if(counter==1) {
			System.out.println("option is present");
		}
		else if(counter==1) {
			System.out.println("option is present with duplicate");
		}
		driver.close();		
}
}