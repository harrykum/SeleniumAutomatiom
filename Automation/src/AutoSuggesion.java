package qsp;

	import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	public class AutoSuggesion {
	
		 static {
			 System.setProperty("webdriver.chrome.driver", "./driver\\chromedriver (1).exe");
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
         WebElement index = allSugg.get(i);
        String text = index.getText();
        System.out.println(text);
		 
		 }
		 driver.close();
	}
}