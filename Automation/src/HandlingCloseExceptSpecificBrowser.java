package qsp;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCloseExceptSpecificBrowser
 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException  {
System.out.println("Enter the title which dont want to close");
Scanner sc=new Scanner(System.in);
String eTitle= sc.nextLine();
WebDriver driver=new ChromeDriver();
driver.get("https://www.naukri.com/");
Set<String> allwh = driver.getWindowHandles();	
for (String wh:allwh) {
	driver.switchTo().window(wh);
	String title = driver.getTitle();
	if (title.equals(eTitle)){
		
	}
	else { 
		driver.close();
	}
}

}
}
