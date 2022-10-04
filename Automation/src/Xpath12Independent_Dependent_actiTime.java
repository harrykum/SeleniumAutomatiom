package qsp;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Xpath12Independent_Dependent_actiTime {
	

		 static {
			 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 }
		 public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com/administration/btlist.do");
	String html =driver.getPageSource();
	driver.findElement(By.xpath("//a[text()='support']/..//../td[5]")).click();

	}

}


