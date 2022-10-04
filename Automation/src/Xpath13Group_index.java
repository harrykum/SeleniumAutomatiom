package qsp;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Xpath13Group_index {
	

		 static {
			 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 }
		 public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			driver.get("file:///G:/jspider/selenium%20sandeep%20sir/11p,10%20dec%202021/tabel2.html");
	String html =driver.getPageSource();
	driver.findElement(By.xpath("(//td[.='selenium'])[2]/../td[2]")).click();

	}

}

