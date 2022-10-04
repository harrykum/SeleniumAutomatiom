package qsp;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Xpath5attribute {
	

		 static {
			 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 }
		 public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			driver.get("file:///G:/jspider/selenium%20sandeep%20sir/8p,7%20dec%202021/xpath.html");
	String html =driver.getPageSource();
	driver.findElement(By.xpath("//input[@type='checkbox' and not(@checked)]")).click();

	}

}
