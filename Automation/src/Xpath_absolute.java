package qsp;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Xpath_absolute {
	

		 static {
			 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 }
		 public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			driver.get("file:///G:/jspider/selenium%20sandeep%20sir/7p,6%20dec%202021/demo.html");
	String html =driver.getPageSource();
	driver.findElement(By.xpath("./html/body/a")).click();

	}

}
