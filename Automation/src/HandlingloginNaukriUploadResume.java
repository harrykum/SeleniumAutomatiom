package qsp;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingloginNaukriUploadResume {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.naukri.com/");
driver.findElement(By.xpath("(//div)[16]")).click();
driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']")).sendKeys("kumarharendra54258@gmail.com");
driver.findElement(By.cssSelector("input[placeholder='Enter your password']")).sendKeys("kuldeep@54258");
driver.findElement(By.xpath("//button[text()='Login']")).click();
driver.findElement(By.xpath("//div[text()='UPDATE PROFILE']")).click();
Thread.sleep(5000);
File f=new File("./data/HARENDRA  KUMAR resume.docx");
String relativepath = f.getAbsolutePath();
driver.findElement(By.id("attachCV")).sendKeys(relativepath);

  }
}