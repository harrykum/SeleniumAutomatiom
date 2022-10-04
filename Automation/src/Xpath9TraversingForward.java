package qsp;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class Xpath9TraversingForward {
	

		 static {
			 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 }
		 public static void main(String[] args) {
		 WebDriver driver=new ChromeDriver();
			driver.get("file:///G:/jspider/selenium%20sandeep%20sir/9p,8%20dec%202021/table.html");
	String html =driver.getPageSource();
	driver.findElement(By.xpath("//td[text()='selenium']")).click();////tr[2]/td[1]

	}

}
