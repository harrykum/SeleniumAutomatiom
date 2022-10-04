package qsp;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Xpath7ContainsFunction {
	

		 static {
			 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 }
		 public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
	String html =driver.getPageSource();
	driver.findElement(By.xpath("//img[contains(@class,'logo')]")).click();

	}

}


