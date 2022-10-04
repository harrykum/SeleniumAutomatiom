package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selector {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///G:/jspider/selenium%20sandeep%20sir/5p,2%20dec%202021/demo.html");
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[name='n1']")).click();
		driver.navigate().back();
	    driver.findElement(By.cssSelector("a[class='c1']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[href='https://jspiders.com/']")).click();
	}

}
