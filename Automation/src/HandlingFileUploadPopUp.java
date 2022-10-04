package qsp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopUp {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("file:///G:/jspider/selenium%20sandeep%20sir/24p,%2028%20dec%202021/resume.html");
	Thread.sleep(5000);
	File f=new File("./data/HARENDRA  KUMAR resume.docx");//generic value by using data folder in Automation
	String relativepath = f.getAbsolutePath();
	driver.findElement(By.id("cv")).sendKeys(relativepath);
driver.close();
}
}
 
