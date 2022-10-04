package qsp;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploadPopUp1 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}//Bypass method
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =new ChromeDriver();
	driver.get("file:///G:/jspider/selenium%20sandeep%20sir/24p,%2028%20dec%202021/resume.html");
	Thread.sleep(5000);
	driver.findElement(By.id("cv")).sendKeys("G:\\jspider\\selenium sandeep sir\\24p, 28 dec 2021\\HARENDRA  KUMAR resume.docx");
}
}
 