package qsp;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SynchronizationCustomWait {          
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args)  {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	int i=0;
	while(i<100) {
		try {
			driver.findElement(By.id("logoutLink")).click();
			break;
		}
		catch(Exception e) {
			i++;
		}
	}	
  }
}

 


