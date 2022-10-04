package qsp;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	public class Locator3 {
		
		 static {
			 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		 }		 
		 public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
	driver.get("file:///G:/jspider/selenium%20sandeep%20sir/5p,2%20dec%202021/demo.html");
	
	WebElement e =driver.findElement(By.linkText("a"));
	e.click();
		

	}
		 
	}