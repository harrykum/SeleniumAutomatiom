package qsp;

	import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	public class AutoSuggesion1orLikeThisAlso {
	
		 static {
			 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		 }
		 public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(5000);
		  List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
				 int size = allSugg.size();
				 System.out.println(size);
				 for(int i=0;i<size;i++) {
String text = allSugg.get(i).getText();
System.out.println(text);
		 
		 }
				 driver.close();
	}
}
